
// ARRAYS ARE FIXED IMMUTABLE CONTAINERS THAT ARE USED TO STORE MULTIPLE VALUES OF ALL DATA TYPES RANGING FROM
// STRING, INTEGER, FLOAT, DOUBLE AND NULL VALUES
// ARRAYS ARE FIXED IN SIZE MEANING ONCE DECLARED WE CANNOT ADD MORE VALUES TO AN ARRAY
// THOUGH WE CANNOT ADD MORE VALUES OR DATA INTO THE ARRAY BUT WE CAN ALTER THE VALUES THAT ALREADY STORED INSIDE THE ARRAY
// SO LETS SAY WE HAVE ARRAY = [1,2,3,4] SO WE CANNOT ADD A EXTRA NEW NUMBER 5 TO IT BUT WE CAN CHANGE ANY OF THE VALUES
// FROM 1 TO 4 AND ALTER IT TO 5 SO THE VALUE INSIDE THE ARRAY IS IMMUTABLE BUT NOT THE SIZE
// SO ONCE CREATED THE SIZE OF AN ARRAY IS FIXED

fun main(){
    val integer_array = intArrayOf(1,2,3,4)
//    TO PRINT A WHOLE ARRAY USE THE .contenttostring() AS WITHOUT IT WILL ONLY PRINT THE MEMORY ADDRESS OF THE ARRAY IN WHICH IT IS STORED
    println(integer_array.contentToString())
//    SO IN PROGRAMMING ARRAYS START FROM THE INDEX 0 TO LENGTH OF ARRAY - 1
//    2) INDEX IN ARRAYS - TO ACCESS THE ELEMENTS INSIDE AN ARRAY WE CAN USE THE INDEX INSIDE [ ] TO ACCESS THE VALUES
    println(integer_array[0])
//    NOW LETS WRITE A PROGRAM THAT TAKES AN INPUT FROM THE USER AS TO WHICH ELEMENT THEY WOULD WANT RETURN BASED ON THE
//    ENTERED INDEX
    println("Enter the index you want to update: ")
    val index_value=readln().toIntOrNull()
    println("Enter the number you want to update that index with: ")
    val new_number=readln().toIntOrNull()
    if (index_value!=null && index_value in 0..integer_array.lastIndex && new_number!=null){
        println("The old array is: ${integer_array.contentToString()}")
        integer_array[index_value]=new_number
        println("The update array is: ${integer_array.contentToString()}")
    }
    else{
        println("The index value is not valid")
    }

}