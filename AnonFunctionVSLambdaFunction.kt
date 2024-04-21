fun main() {
  // Write your code below
  //lamba function format:
  //val area = {base:Int, height:Int -> (base*height)/2}

  //single line expression format
  //fun findRemainder(num1: Int, num2: Int) = num1 % num2
  
  //anon function format:
  val area = fun(base:Int, height:Int): Int {
    return (base*height)/2
  }
  //find the area of a triangle with a base of 15, and a height of 19
  //print the area to the screen
  println(area(15,19))

  //create a function using a lambda expression/format
  //the function must be named "perimeter", and it should accept two integers named side1 and side2, add them together, multiply by 2, and return the result as an Int
  val perimeter = {side1:Int, side2:Int -> (side1+side2)*2}
  println(perimeter(15, 24))
}
