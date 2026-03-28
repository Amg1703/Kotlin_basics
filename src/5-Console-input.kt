fun main() {
//   WE CAN USE THE READLN FUNCTION TO RECEIVE INPUTS FROM THE USER THROUGH THE CONSOLE JUST LIKE HOW WE USE INPUT() IN PYTHON
//    BY DEFAULT THE READLN FUNCTION RECEIVES INPUTS AS STRINGS
//    HOWEVER WE CAN CONVER THE VALUE TO INTEGER OR FLOAT OR DOUBLE THROUGH THE readln.toInt, .toFloat AND SO ON
    println("Enter a number: ")
    var input_integer:Int = readln().toInt()
    var is_input_number_even:Boolean = input_integer%2==0
    println("Is the input number even: $is_input_number_even")
// AS WE CAN SEE WHEN WE ENTER A STRING WHILE USING readln().toInt() IT THROWS AN ERROR

}