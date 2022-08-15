object Currying extends App{

  // transforms multiple arguments into a singular argument

  def add(x: Int, y:Int) = x + y

  def add3 (x: Int) (y: Int) = x + y;

  def add2 (x: Int) = (y: Int) => x + y;

  println(add3(20)(20))

  val sum50 = add3(50)

  println(sum50(400))
}
