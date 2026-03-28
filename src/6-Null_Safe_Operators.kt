// NULL SAFETY OPERATOR : 1) :? AND 2) :.
//   1) ?: OPERATOR :-
//    ?: IS AN ASSIGNMENT OPERATOR AND IS USED TO ASSIGN A VALUE TO THE VARIABLE IF THE VARIABLE GETS ASSIGNED A NULL VALUE
//    SO WHENEVER WHAT WE HAVE ON THE LEFT SIDE OF THE OPERATOR IS NOT SATISFIED THEN THE OPERATOR ASSIGNS THE DEFAULT VALUE GIVEN ON
//    THE RIGHT SIDE OF THE OPERATION TO THE VARIABLE
fun main(){
    println("Enter a number or string: ")
    val is_even_or_null_default_to_0= readln().toIntOrNull()?:0
    println("The number is: $is_even_or_null_default_to_0")
//    SO AS YOU CAN SEE WHEN WE ENTER A STRING THE INTORNULL FUNCTION CONVERTS IT INTO A NULL VALUE AND NOW THE RIGHT SIDE OF ?. OPERATOR
//    RUNS THUS THE NULL VALUE IS DEFAULTED AND ASSIGNED 0

//    2) ?. OPERATOR :-
//    ?. OPERATOR IS USED AS AN EXECUTION OPERATOR WHERE GIVEN THAT WHATEVER IS WRITTEN ON THE LEFT SIDE OF THE OPERATOR SATISFIED
//    THEN WHATEVER IS ON THE RIGHT SIDE OF THE OPERATOR GETS EXECUTED

//    3) THE .inc() FUNCTION :-
//    THE INC FUNCTION IS TO INCREMENT ANY INTEGER OR FLOAT BY 1 THAT IS ADD 1 TO THE INTEGER OR FLOAT OR DOUBLE VALUE
    println("For the .inc() function:- Enter a another number to be incremented by 1 or a String: ")
    val is_even_or_null_increment_by_1= readln().toIntOrNull()?.inc()
    println("The number or string is: $is_even_or_null_increment_by_1")

//    4) THE .rem() FUNCTION :-
//    THE REMAINDER FUNCTION WORKS JUST LIKE % FUNCTION WHEREIN IT RETURNS THE REMAINDER OF THE DIVISION OF THE 2 NUMBERS
    println(" For the .rem() function:- Enter the a number to return the remainder of the number on dividing by 2 or the Null value if in case you input a string: ")
    val remainder_on_division_by_2_or_string = readln().toIntOrNull()?.rem(2)
    println("The remainder on division is $remainder_on_division_by_2_or_string")
//    5) THE .equals() FUNCTION :-
//    THE EQUALS FUNCTION WORKS JUST LIKE == COMPARISON OPERATOR WHEREIN IT RETURNS TRUE IF THE LEFT SIDE AND RIGHT SIDE OF THE OPERAND ARE TRUE
    println("For the .equals() function :- Enter a number to check odd or even: ")
    val is_even_or_null = readln().toIntOrNull()?.rem(2)?.equals(0)
    println("The given number is even: $is_even_or_null")

//    NULL SAFETY MECHANISM IN KOTLIN :-
//    KOTLIN THUS OFFERS THESE 2 NULL SAFETY OPERATORS TO AVOID NULL POINTER EXCEPTION ERROR APART FROM THESE 2 NULL SAFETY OPERATORS
//    THE KOTLIN COMPILER NATURALLY DOES NOT ALLOW A POSSIBLE NULL POINT EXCEPTION ERROR SO EVEN IF A CODE IS SYNTACTICALLY FINE
//    BUT IF THE LOGIC OF THE CODE HAS POSSIBILITY OR BUG THAT COULD CAUSE A NULL POINT ERROR LIKE IN THE PREVIOUS CASE OF TRYING TO FIND
//    ODD OR EVEN ON A NULL VALUE WHEN YOU ENTER STRING
}
//