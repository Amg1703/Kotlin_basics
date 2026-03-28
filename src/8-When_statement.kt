
// WHEN STATEMENTS ARE AN ALTERNATIVE TO IF ELSE IF AND ELSE STATEMENT WHEN THERE ARE 2 MANY CONDITIONS DECLARED
// AS WE SAW IN THE LAST FILE OF IF , ELIF AND ELSE STATEMENT WHEN THERE ARE A LOT OF CONDTIONS IT BECOMES CONFUSING
// AND DIFFICULT TO READ THE CODE SO WITH WHEN STATEMENT THE DECLARED CONDITIONS BECOMES MORE EASY TO READ


fun main() {
    println("Enter a valid number not string or float or double: ")
    val input_number_or_null = readln().toIntOrNull()
    if (input_number_or_null != null) {
        val output = when {
            input_number_or_null % 2 == 0 -> "Even"
            input_number_or_null < 10 -> "Odd and less than 10"
//           BY SYNTAX ITS NECESSARY
            else -> "Odd and greater than 10"
        }
        println("The number is $output")
    } else {
        println(" Wrong!! Please enter a valid number")
    }

    println("2nd approach :- Enter a valid number not a string or float or boolean: ")
    val input_number_or_null_2 = readln().toIntOrNull()
        val output = when (input_number_or_null_2) {
            null -> "Dudeee!! Enter a valid number please!!!"
            3 -> "The input number is 3"
            5 -> "The input number is 5"
//          1) THE IN OPERATOR - IS USED TO CHECK IF THE MENTIONED VALUE LIES BETWEEN MENTIONED RANGE
            in 10..20 -> "The input number lies in the range between 10 and 20"
            in 20..30 -> "The input number lies in the range between 20 and 30"
            in 30..40 -> "The input number lies in the range between 30 and 40"
            in 40..50 -> "The input number lies in the range between 50 and 60"
            else -> "The number must be greater than 50 and not 3 or 5"
        }
        print("The output is $output")
    }