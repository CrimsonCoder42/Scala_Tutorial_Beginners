object Getting_started extends App {

  object Math {
    def add(x: Int, y: Int) : Int = x + y

    def square(x: Int) = x * x
  }




  def subtract(x: Int, y: Int): Int = x - y

  def divide(x: Int, y: Int): Int = x / y

  def multiply(x: Int, y: Int): Int = x * y


  println(Math.add(2,3))
  println(Math.square(3))
//  println(subtract(2,3))
//  println(divide(2,3))
//  println(multiply(2,3))


}

