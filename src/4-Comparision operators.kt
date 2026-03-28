fun main(){
    var x: Int=11
    var y: Int=15
//    Comparison operators (>, >=, <, <=, ==,  !=) will compare two values (operands) and evaluate it to a boolean result,
//    even if the operands are not boolean values.
//    COMPARISON OPERATORS ARE USED TO COMPARE INTEGERS, WHOLE, DECIMAL NUMBER AND EVEN STRINGS TO CHECK IF ONE ENTITY IS SMALLER, LARGER OR EQUAL TO THAN THE OTHER
//    COMPARISON OPERATORS RETURNS ONLY BOOLEAN VALUES THAT IS WHETHER TRUE OR FALSE
    println(x<y)
    println(x>y)

//    WE CAN PERFORM COMPARISON OPERATION AND STORE IT IN VARIABLE AS IN THE END IT IS JUST BOOLEAN VALUE
    var if_variable_less_than_12: Boolean=x<12
    println(if_variable_less_than_12)

// WE CAN PERFORM ARTHIMETIC AND COMPARISON OPERATION IN COMBINATIONS AND ALSO $ IS STRING OPERATOR AND WE CAN USE ${ } TO WRITE LONG EXPRESSIONS
    println("Is this number even: ${x%2==0}")
//    WE CAN USE GREATER THAN OR EQUAL TO OPERATOR TO CHECK IF A NUMBER OR STRING IS GREATER THAN OR EQUAL TO IT
    println(x>=y)
}
