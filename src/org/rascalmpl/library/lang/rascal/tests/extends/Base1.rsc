module lang::rascal::tests::extends::Base1

data A = a() | b();

str default_message = "default use";
  
default str EXTENDED_FUNCTION(value t) = default_message;
  
str apply_EXTENDED_FUNCTION_a() = EXTENDED_FUNCTION(a());

str apply_EXTENDED_FUNCTION_b() = EXTENDED_FUNCTION(b());