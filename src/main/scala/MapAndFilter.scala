object MapAndFilter extends App {

  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val myMap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

  println(lst.map(x => x * 0.2));
  println(lst.map(x => "hi" * x));
  println(myMap.map(x => "hi" + x))
  println("Hello".map(_.toUpper));
  println(List(List(1,2,3), List(3,4,5)).flatten);
  println(lst.flatMap(x => List(x, x+1)))

  println(lst.filter(x => x%2 !=0))


}
