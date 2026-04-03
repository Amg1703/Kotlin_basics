
// FUNCTIONS - FUNCTIONS IN KOTLIN ARE REUSABLE BLOCK CODE WRITTEN TO PERFORM A SPECIFIC OPERATION
// FUNCTION MAKES THE CODE MORE READABLE AND ORGANISED AND REDUCES THE NEED FOR REDUNDANCY SINCE WHENEVER WE WANT TO WE
// CAN JUST CALL THE FUNCTION TO PERFORM THE OPERATION INSTEAD OF WRITING THE CODE ALL OVER AGAIN
// HENCE FUNCTION ARE REUSABLE SNIPPETS

fun main(){
    println("Enter your input: ")
    val input=readln()

    val reversed_string=reverse_string_function(string_to_reverse = input)

    if(input.equals(reversed_string) == true){
        println("It is palindrome: $reversed_string")

    }
    else{
        println("It is not a palindrome. The reversed string is $reversed_string")
    }
}
// SO WE INSIDE THE PARENTHESIS DECLARE THE ARGUMENT AND THE DATA TYPE OF THE PARAMETER THAT WILL BE RECEIVED
// IF IN CASE THE FUNCTION RETURNS ANY VALUE WE NEED TO MENTION THE DATA TYPE OF THE RETURN VALUE AFTER THE PARENTHESIS
// THEN WE USE THE BUILDSTRING FUNCTION TO CONTSTRUCT A DYNAMIC STRING AS STRINGS LIKE ARRAYS ARE IMMUTABLE IN NATURE

fun reverse_string_function(string_to_reverse:String): String {
    val final_reversed_string = buildString {
        for (i in string_to_reverse.length - 1 downTo 0){
            append(string_to_reverse[i])
        }
    }
    return final_reversed_string
    }