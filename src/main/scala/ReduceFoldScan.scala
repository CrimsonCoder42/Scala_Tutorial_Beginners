object ReduceFoldScan extends App{

  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val lst2 = List("A", "B", "C", "D");
  val myMap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

  println(lst.reduceLeft(_ + _));
  println(lst.reduceLeft((x,y) => {println(x + " , "+ y); x+y;}));


  println(lst.reduceRight(_ + _));
  println(lst.reduceRight((x,y) => {println(x + " , "+ y); x-y;}));
}
