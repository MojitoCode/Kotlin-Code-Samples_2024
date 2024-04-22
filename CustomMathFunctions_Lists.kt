// Write your code below
//GET NUMBERS LIST - create a function that takes in a list of numbers
fun getListOfNumbers(): List<Int>{
  var myList = mutableListOf<Int>()
  for(i in 1..7){
    println("Please enter a number:")
    val userInput = Integer.valueOf(readLine())
    myList.add(userInput)
  }
  return myList
}

//FIND MAX. - create a function that takes in a list of integers, and then returns the max value
fun findMax(myList: List<Int>):Int{
  var largestNumber = myList[0]
  for(i in myList){
    if(i > largestNumber){
      largestNumber = i
    }
  }
  return largestNumber
}

//FIND MIN. - create a function that takes in a list of integers, and then returns the min value
fun findMin(myList: List<Int>):Int{
  var smallestNumber = myList[0]
  for(i in myList){
    if(i < smallestNumber){
      smallestNumber = i
    }
  }
  return smallestNumber
}

//FIND AVERAGE - create a function that takes in a list of integers, finds the average, and returns that value
fun findAverage(myList: List<Int>): Int{
  var sum = 0
  for(i in myList){
    sum += i
  }
  return sum / myList.size
}

//CHECK FOR NUMBER IN LIST - create a function that reviews a list and checks whether a specified number is in a given list
fun checkIfListContains(myList: List<Int>, num1:Int): Boolean{
  for(i in myList){
    if(i == num1){
      return true
    }
  }
  return false
}


fun main() {
  // Write more code below
  var values = getListOfNumbers()
  println(values)

  var largestValue = findMax(values)
  println("The largest number is $largestValue.")

  var smallestValue = findMin(values)
  println("The smallest number is $smallestValue.")

  var average = findAverage(values)
  println("The average is $average.")

  println("Please enter a number: ")
  val numToFind = Integer.valueOf(readLine())
  val containsValue = checkIfListContains(values, numToFind)
  if(containsValue){
    println("$numToFind exists within the list.")
  }else{
    println("$numToFind not found in list.")
  }
}

