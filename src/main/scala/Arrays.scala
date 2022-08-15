import Array._

object Arrays extends App{

  var myArray: Array[Int] = new Array[Int](4);
  var myArray2= new Array[Int](5);
  val myArray3 = Array(1,2,3,4,5,6,7,8,9);

  myArray(0) = 20;
  myArray(1) = 50;
  myArray(2) = 10;
  myArray(3) = 30;

  val result = concat(myArray, myArray3)

  for (x <- result){
    println(x)
  }

  for (i <- 0 to (myArray.length -1)){
    println(myArray(i))
  }

}
