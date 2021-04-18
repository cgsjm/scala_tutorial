package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 19:09
 * @Desc 匿名子类
 */
object Test10_AnonymousClass {
  def main(args: Array[String]): Unit = {
    val person = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = {
        println("person eat")
      }
    }

    println(person.name)
    person.eat()
  }
}

//定义抽象类
abstract class Person10 {
  //抽象属性
  var name: String

  //抽象方法
  def eat(): Unit
}
