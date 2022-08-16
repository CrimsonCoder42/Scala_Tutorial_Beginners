object Sets extends App {

  val mySet: Set[Int] = Set(1,2,3,4,5,6,7)
  val mySet2: Set[Int] = Set(11,12,3,14,5,16,7)

  val mySet3: Set[Int] = mySet ++ mySet2

  println(mySet)
  println(mySet(6))
  println(mySet ++ mySet2)

  mySet3.foreach(println)

}
