// Write your code below
tailrec fun factorial(num:Int, product:Int=1):Int{
  return if(num==1) product
  else factorial(num-1,num*product)
}


fun main() {
  // Write more code below
  var factorialValue = factorial(10)
  println(factorialValue)
}


/*
* Recursion = the process of a function calling itself from within a function’s code block.
* Required = a base case and a recursive call.
* The base defines which condition must be met in order to exit the recursive function
* The recursive call is used to call the function with a new set of arguments.
* A tail-recursive function is a more efficient way of producing a recursive function because it prevents stack overflow.

URL: https://www.codecademy.com/courses/learn-kotlin/articles/kotlin-recursion
Date: 4/21/24
*/
