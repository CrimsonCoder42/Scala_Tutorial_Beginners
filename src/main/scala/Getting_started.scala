object Getting_started extends App {

  val age = 200;

  age match {

    case 20 => println(age);
    case 18 => println(age);
    case 19 => println(age);
    case 21 => println(age);
    case 30 => println(age);
    case 40 => println(age);
    case _ => println("default")

  }

  val result = age match {

    case 20 => age;
    case 18 => age;
    case 19 => age;
    case 21 => age;
    case 30 => age;
    case 40 => age;
    case _ => age;

  }
  println(" result = " + result);

}

