fun main() {
    val kotlin_version = KotlinVersion.CURRENT
    println("The kotlin version is $kotlin_version")

    println("Enter input")
    val user_input = readln()
    println(user_input)

//    PROGRAM TO PERFORM ADD, SUB , MULTIPLICATION AND DIVISION OF 2 NUMBERS
    println("Enter 1st number: ")
    val input_1 = readln()
    println("Enter 2nd number: ")
    val input_2 = readln()
    println("Enter what operation to perform choose only: add, subtract, multiply or divide")
    val operation_to_perform = readln()
    val num_1 = input_1.toIntOrNull()
    val num_2 = input_2.toIntOrNull()
    if (num_1 !=null && num_2 !=null){
        val output = when (operation_to_perform) {
            "add" -> {
                num_1 + num_2
            }

            "subtract" -> {
                num_1 - num_2
            }

            "multiply" -> {
                num_1 * num_2

            }

            "divide" -> {
                num_1 / num_2
            }

            else -> {
                println("Please enter a valid operation between add, subtract, multiple or divide")
                null
            }
        }
        if (output!=null) {
            println("The output of the operation of the 1st number: $num_1 and 2nd number: $num_2 are $output")
        }
        }
    else {
        println("Please enter valid integers and not strings like $input_1 and ${input_2}")
    }
    }
