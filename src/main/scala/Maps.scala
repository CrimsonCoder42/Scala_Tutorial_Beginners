object Maps extends App{

   val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "July")

    println(myMap)
    println(myMap(803))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach { key =>
      println("key " + key);
      println("Value " + myMap(key));

    }

    println(myMap.contains(801000))

}
