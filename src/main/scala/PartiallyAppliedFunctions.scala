import java.util.Date


object PartiallyAppliedFunctions extends App {

  def log(date : Date, message: String): Unit = {
    println(s"$date  $message");

  }

  val sum = (a: Int, b: Int, c:Int) => a + b + c

  val f = sum(10, _: Int, _: Int)

//  println(f(100, 200))

  val date = new Date;
  val newLog = log(date, _: String);
  newLog("The message 1")
  newLog("The message 2")
  newLog("The message 3")
  newLog("The message 4")
  newLog("The message 5")
  newLog("The message 6")
  newLog("The message 7")
  newLog("The message 8")

}
