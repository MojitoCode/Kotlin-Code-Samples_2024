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
