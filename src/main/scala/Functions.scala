object Functions extends App{

  object Math {
    //def add(x: Int, y: Int): Int = x + y

    def square(x: Int) = x * x
  }


  def subtract(x: Int, y: Int): Unit = {
    println(x-y)
  }

  // anonymous function
  var add = (x : Int, y : Int) => x + y


  println(add(2, 3))
  println(Math.square(3))

  subtract(2,4)

}
