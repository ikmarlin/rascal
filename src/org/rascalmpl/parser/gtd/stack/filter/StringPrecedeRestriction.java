/*******************************************************************************
 * Copyright (c) 2009-2011 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.parser.gtd.stack.filter;

import org.rascalmpl.parser.gtd.util.specific.PositionStore;

public class StringPrecedeRestriction implements IEnterFilter{
	private final char[] string;
	
	public StringPrecedeRestriction(char[] string){
		super();
		
		this.string = string;
	}
	
	public boolean isFiltered(char[] input, int location, PositionStore positionStore){
		if((location - string.length) >= 0){
			int startLocation = location - string.length;
			for(int i = string.length - 1; i >= 0; --i){
				if(input[startLocation + i] != string[i]) return false;
			}
			return true;
		}
		
		return false;
	}
}
