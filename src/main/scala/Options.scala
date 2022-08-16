object Options extends App {

  val lst = List(1,2,3);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  val opt : Option[Int] = Some(5);

  println(lst.find(_ > 2))
  println(map.get(5).getOrElse("No name found"));

  println(opt.isEmpty)
  println(opt.get)

}
