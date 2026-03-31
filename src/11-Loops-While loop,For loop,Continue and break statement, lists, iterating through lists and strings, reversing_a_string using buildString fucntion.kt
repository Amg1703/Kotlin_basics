
// LOOPS

fun main(){
//    1) WHILE LOOP :-
//    ONE OF THE EASIEST LOOPS IS THE WHILE LOOP
//    SO A WHILE LOOP IS EXECUTED TILL THE CONDITION IS SATISFIED
    println("Enter the amount number you want to add: ")
    val amount_of_numbers = readln().toIntOrNull()?:0
//    THIS IS THE COUNT VARIABLE AND EVERY OTHER LOOP USE THIS CONVENTION TO KEEP TRACK OF THE NUMBER OF TIMES ITS LOOPED
    var i = 0
    var sum =0

//    LETS DECLARE THE WHILE LOOP
    while(i<amount_of_numbers){
//        SO UNTIL THE COUNT REACHES THE AMOUNT OF NUMBER REQUIRED THE WHILE LOOP LOOPS THE CODE BELOW
//        FOR EVERY ITERATION THE NUMBER INPUT IS ASKED AND THE INPUT NUMBER IS SUMMED TO THE PREVIOUS STORED SUM
        println("Enter the number $i: ")
//        NOW THE PROBLEM WITH ASSIGNING 0 AS THE DEFAULT VALUE IS THAT EVEN IF WE ENTER A STRING IT WILL BE ASSIGNED DEFAULT
//        VALUE OF 0 AND THE ITERATION WILL BE CARRIED OUT AS USUAL BUT WHAT IF WE WANT TO STOP ITERATING THE COUNT
//        UNTIL THE USER ENTER A VALID VALUE
//        2) CONTINUE STATEMENT - IS USED TO CONTINUE THE LOOP AS LONG AS THE CONDITION IS SATISFIED
//        SO HERE IN OUR CASE WE USE CONTINUE IN THE PLACE OF 0 SO IF THE USER ENTERS A STRING THE CODE BELOW ISNT EXECUTED
//        SO THE COUNT i IS NEVER ITERATED UNTIL THE USER ENTER A VALID INTEGERS SO WHEN THE USER KEEPS ENTERING STRINGS
//        THE CODE KEEPS GOING BACK AND FORTHC BETWEEN THIS STATEMENT AND THE WHILE LOOP UNTIL THE USER ENTERS A VALID INTEGER
        val number_to_be_added = readln().toIntOrNull()?: continue
//        EVERY ITERATION THE NEW NUMBER IS ADDED TO THE PREVIOUSLY STORED SUM UNTIL THE COUNT REACHES THE AMOUNT OF NUMBERS
        sum += number_to_be_added
//        THE COUNT IS ITERATED BY 1 FOR EVERY ITERATION AS IT SHOULD
        i++
    }
    println("The sum of the numbers is $sum")

//    2) USING WHILE LOOP TO STORE IN ARRAYS
    var array_to_be_stored_in =  arrayOf<Int>()
    i=0
    while(i<amount_of_numbers){
        println("Enter the number $i: ")
        val number_to_be_added = readln().toIntOrNull()?: continue
        array_to_be_stored_in+=number_to_be_added
        i++
    }
    println("The final array is: ${array_to_be_stored_in.contentToString()}")
// BUT THE PROBLEM WITH THIS APPROACH IS THAT WE KNOW THAT ARRAY ARE IMMUTABLE SO ONCE CREATED THEIR SIZE CANNOT CHANGE
// MEANING YOU CANT ADD NEW NUMBER ALL YOU CAN DO ALTER THE OLD ONES THUS EVERY TIME WE APPEND A NEW ELEMENT IT CREATES
//    A NEW ARRAY
//    SO AN OPTIMAL APPROACH IS USING LISTS WHICH ARE MUTABLE
    var list_to_be_Stored_in = mutableListOf<Int>()
    i=0
    while(i<amount_of_numbers){
        println("Enter the number $i to be stored in the list: ")
        val number_to_be_added = readln().toIntOrNull()?: continue
        list_to_be_Stored_in.add(number_to_be_added)
        i++
    }
    println("The final stored list is: $list_to_be_Stored_in")

//    3) FOR LOOP - IS USED TO ITERATE MAINLY THROUGH ITERABLES SUCH AS PRINTING A LIST ELEMENT BY ELEMENT OR EXECUTING
//    ANY OPERATION UNTIL THE CONDITION IS SATISFIED
//    AND HERE WE DONT NEED TO DECLARE THE i=0 OR WE DONT NEED TO INITIALIZE AND DECLARE A SEPARATE VALUE FOR COUNT AS IT
//    CAN BE DECLARED IN THE STATEMENT ITSELF
//    4) UNTIL - IS USED TO DEFINE A RANGE OF UNTIL THAT IS TILL 1 INDEX BEFORE THE ACTUAL NUMBER
//
    val list_to_be_stored_2 = mutableListOf<Int>()
    for(i in 0 until amount_of_numbers){
        println("Enter the number $i: ")
        val number_to_be_stored_1 = readln().toIntOrNull()?:0
        list_to_be_stored_2+= number_to_be_stored_1
    }

//    SO AS MENTIONED EARLIER WE CAN PRINT SEPARATE ELEMENTS OF LISTS OR PRINT OUT EACH ELEMENT OF A STRING
    for(i in 0 until amount_of_numbers){
        println("Enter the number $i ")
    }
    println("Enter String to be iterated: ")
    val string_to_be_printed = readln()
    for (character in string_to_be_printed){
        println(character)
    }
//    5) BUILDSTRING FUCNTION - REVERSING A STRING
//    NOW WE CAN USE THE FOR LOOP AND DOWN TO FUNCTION IS USED TO COUNT THE INDEX IN THE DESCENDING ORDER

    val reversed_string = buildString {
        for( i in string_to_be_printed.lastIndex downTo 0){
            append(string_to_be_printed[i])
        }
    }
    println(reversed_string)
}