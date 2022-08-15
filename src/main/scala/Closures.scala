object Closures extends App{

  // closure is a function that uses one or more variables that are declared outside
  //function
  val number = 10;
  val add = (x: Int) => {
    number = x + number;
    number;
  };

  number = 100;
  println(add(20))
  println(number)


}
