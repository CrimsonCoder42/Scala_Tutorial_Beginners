object AuxiliaryConstructor extends App{

  class User(var name: String, var age: Int) {
    def this() = {
      this("Tom", 32);
    }

    def this(name : String) = {
      this(name, 32);
    }

  }


  var user1 = new User("Max", 20);
  var user2 = new User()
  var user3 = new User("Max")

  println(user1.name)
  println(user2)
  println(user3)

}
