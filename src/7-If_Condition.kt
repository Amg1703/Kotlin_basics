

// IF CONDITION :- THE IF CONDITION ALLOWS US TO PERFORM AN OPERATION GIVEN THAT A CONDITION IS SATISFIED
// THE IF CONDITION CAN BE NESTED WITH AN ELSE STATEMENT WHICH WILL BE EXECUTED IF THE CONDITION INSIDE THE IF STATEMENT IS NOT SATISFIED

fun main(){
    println("Enter a number: ")
    val input_number_or_null_value=readln().toIntOrNull()
    if (input_number_or_null_value!=null){
        val is_even: Boolean = input_number_or_null_value%2==0
//        NOW THAT WE HAVE USED THE IF STATEMENT TO CHECK IF THE INPUT VALUE IS NULL OR NOT AND ONLY IF IT IS NOT NULL WE ARE PERFORMING
//        THE OPERATION. THUS THE COMPILER ALLOWS US TO RUN THE CODE SINCE WE HAVE PASSED NULL CHECK MECHANISM NOW.
        if (is_even) {
            println("YAYY! The number is even")
        }
        else{
            println("NAH MEH! The number is odd")
        }
    }
    else {
        println("The input number is not a number. Any string, float or double will be converted as a null value: $input_number_or_null_value")
    }

// ELSE IF STATEMENT :-
// TO CHECK MORE MULTIPLE CONDITIONS WE CAN USE THE ELSE IF STATEMENT ALONG WITH IF AND ELSE STATEMENTS TO CHECK MORE CONDITIONS
// WE CAN VARIABLES TO STORE THE IF STATEMENT WHEREIN THE RESULT OF THE OPERATION WILL BE SAVED TO THE VARIABLE
    println("Enter a number to check Odd or even using if and else if: ")
    val input_number_or_null=readln().toIntOrNull()
    if (input_number_or_null!=null){
        val output=if(input_number_or_null%2==0){
            "The number is even"
        } else if(input_number_or_null<10){
                "The number is odd and less than 10"
            } else{
                "The number is odd and greater than 10"
        }
        println(output)
    }
    else{
        println("Enter a valid number not string or float or double")
    }

}