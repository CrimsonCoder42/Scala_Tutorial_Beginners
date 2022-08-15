object HigherOrderFunctions extends App {

  // take functions as arguments and are able to return function as result

  def math(x: Double, y:Double, z: Double, f: (Double, Double) => Double): Double = f(f(x,y), z);

  val result = math(50, 20, 10, (x,y) => x max y)

  println(result)

}
