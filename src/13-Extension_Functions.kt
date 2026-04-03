
// EXTENSION FUNCTIONS - THESE ARE FUNCTIONS THAT CAN BE CALLED BASED ON THE OBJECTS AND DO NOT NEED TO INPUT THE OBJECTS
// AS PARAMETERS INSTEAD THEY CAN BE CALLED USING THE . OPERATOR

fun main(){
    println("Enter the string to be reversed: ")
    val string_input = readln()

    val reversed_string = string_input.reverse_string_function()

    if(string_input == reversed_string){
        println("The string $string_input is a palindrome. ")
    }
    else{
        println("The string entered $string_input and its reversed string $reversed_string is not a palindrome. ")
    }

}

// WE CAN EASILY WRITE AN EXTENSION FUNCTION BY FIRST MENTIONING THE DATA TYPE OF THE OBJECT FOR WHICH THIS EXTENSION
// FUNCTION CAN BE CALLED AND WE DON'T NEED TO PASS THE OBJECT AS AN ARGUMENT
// ALTHOUGH IF YOU WANT TO ADD NEW ARGUMENTS AND PARAMETERS YOU CAN DO SO AS YOU WISH
// 2) THIS KEYWORD - NOW THAT WE DON'T PASS AN ARGUMENT NOR THE DATA TYPE OF THE PARAMETER THAT WILL BE SUPPLIED WHEN
// CALLING THIS FUNCTION HOW WILL KOTLIN KNOW WHICH DATA TYPE OBJECT SHOULD THIS FUNCTION WORK ON??
// THIS IS WHERE THE "this" KEYWORD COMES INTO PLAY AND IS USED FOR REFERENCING THE PARAMETER OBJECT USING this@function_name
// OTHER THAN THIS THE 'this' KEYWORD IS ALSO USED IN OTHER CONTEXTS AS WELL

fun String.reverse_string_function(): String{
    val final_reversed_string = buildString {
        for(i in this@reverse_string_function.lastIndex downTo 0){
            append(this@reverse_string_function[i])
        }
    }
    return final_reversed_string
}