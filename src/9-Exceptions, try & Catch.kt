
// EXCEPTIONS ARE THROWN WHEN A CODE HAS LOGICAL ERROR OR WHEN IT RECIVES AN INVALID INPUT
// IF WE CAN PREDICT THE EXCEPTIONS THAT WILL BE THROWN THEN WE CAN USE THE TRY & CATCH STATEMENT TO THE CATCH THE EXCEPTION
// AND WRITE EDGE CASES ON WHAT THE PROGRAM IS SUPPOSED TO DO IF THAT EXCEPTION IS THROWN IN THE CODE
// THE TRY AND CATCH STATEMENT ARE NESTED JUST LIKE IF AND ELSE SO TRY STATEMENT IS USED TO TRY OUT THE BLOCK OF CODE
// WRITTEN UNDERNEATH IT INSIDE THE { } BRACKETS AND IF THE THAT BLOCK CODE INSIDE TRY STATEMENT WAS NOT ABLE TO EXECUTE
// THEN THE CATCH BLOCK OF CODE IS EXECUTED
// THE FINALLY BLOCK IS USED FOR CODE WHICH WILL RUN WHETHER OR NOT THE CODE BEFORE RUNS OR NOT SO IN PRODUCTION THEY ARE
// USED TO RUN
fun main() {
    println("Enter a integer not string nor float nor double: ")
    val input_data=readln()
    val input_integer = try {
        input_data.toInt()
    }
    catch (e: NumberFormatException) {
        0
        println("Next time please enter a valid integer not a string nor a float nor double")
    }
    finally{
        println("Thanks for entering your output will be displayed!")
    }
    val output = when (input_integer) {
        0 -> "You either entered a 0 or a string which is an invalid input so please enter a valid integer next time"
        in 10..20 -> "The number you entered was between 10 and 20"
        in 20..30  -> "The number you entered was between 20 and 30"
        in 30..40 -> "The number you entered was between 30 and 40"
        else -> "The number is greater than 40 or negative"
    }
    println("Your output is: $output")
}