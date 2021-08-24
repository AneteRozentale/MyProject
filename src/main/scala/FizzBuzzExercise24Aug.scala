object FizzBuzzExercise24Aug extends App {
  //TODO create an Array[String] containing FizzBuzz values from 1 to 100 included

  //FIXME
  val myNumbers = (1 to 100).toArray

  //you can either yield or map
  //I recommend creating a helper function
  def getFizzBuzzText(n: Int)= {
    //FIXME
    if ((n % 5 == 0) && (n % 7 == 0)) s"FizzBuzz"
    else if ( n % 5 == 0 ) s"Buzz"
    else if ( n % 7 == 0) s"Fizz"
    else s"$n"
  }

  //yield approach
  val myFizzBuzz = for (n <- myNumbers) yield getFizzBuzzText(n)
  myFizzBuzz.foreach(println)

  //or we could also use map
  val myFizzBuzzToo = myNumbers.map(n => getFizzBuzzText(n))
  myFizzBuzzToo.foreach(println)

}
