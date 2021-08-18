object ExerciseAug17FizzBuzz extends App {
  //for numbers 1 to 100 (included!)
  //print FizzBuzz if number divides evenly by both 5 and 7
  //print Fizz if number only divides by 5
  //print Buzz if number divides by 7
  //print number if number does not divide by 5 or 7
  //so something like this 1,2,3,4,Fizz,6,Buzz,..... 34,FizzBuzz,36,....


  for (number <-1 to 100) {
  if ((number %5==0)&&(number %7==0))
  println("FizzBuzz")
  else if (number %5 ==0)
  println("Fizz")
  else if (number %7 == 0)
  println("Buzz")
  else
  println(s"$number")
  }
}
