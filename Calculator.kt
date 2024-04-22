// Write your code here 
//create calculator class
class Calculator(val name:String){
  init{
    println("$name\'s Calculator")
  }
  //addition
  fun add(num1:Int, num2:Int):Int{
    return num1+num2
  }
  //subtraction
  fun subtract(num1:Int, num2:Int):Int{
    return num1-num2
  }
  //multiplication
  fun multiply(num1:Int, num2:Int):Int{
    return num1*num2
  }
  //division
  fun divide(num1:Int, num2:Int):Any{
    if(num2 == 0){
      return "Error: Can't Divide By Zero"
    }else{
      return num1/num2
    }
  }
  //power of/exponents
  fun power(num1:Int, num2:Int):Int{
    var result = 1
    for(i in 1..num1){
      result *= num2
    }
    return result
  }
}


//main
fun main(){
  val codeysCalculator = Calculator("Codey") //Codey's Calculator
  println(codeysCalculator.add(4,5)) //9
  println(codeysCalculator.subtract(10,3)) //7
  println(codeysCalculator.multiply(5,8)) //40
  println(codeysCalculator.divide(6,2)) //3
  println(codeysCalculator.divide(6,0)) //Error Message
  println(codeysCalculator.power(3,3)) //27
}
