object Lists extends App{

  val myList: List[Int] = List(1,2,3,4,5,6)
  val names: List[String] = List("Max", "Tom", "John");


  println(4 :: myList) // Just prepends

  println(1:: 5:: 9:: Nil); // :: prepends the Nil
  println(myList.tail); // List(2, 3, 4, 5, 6)
  println(myList.head); // 1
  println(names.isEmpty); // false
  println(myList.max); // 6

  myList.foreach( println ) // prints each num on new line
  var sum : Int = 0;
  myList.foreach( sum += _)

  println(sum)

  for (name <- names) {
    println(name);  // Prints each name on new Line
  }

}
