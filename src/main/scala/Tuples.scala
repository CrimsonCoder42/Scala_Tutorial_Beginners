object Tuples extends App{

  val myTuple = (1, 2, "hello", true);
  val myTuple2 = new Tuple3(1,2,"hello")
  println(myTuple)
  println(myTuple2._3)


  myTuple.productIterator.foreach{
    i => println(i);
  }

  println(1 -> "Tom")

  println(myTuple._4)

}
