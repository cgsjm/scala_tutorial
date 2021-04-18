package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 15:22
 *
 */
object Test04_ClassForAccess {
  def main(args: Array[String]): Unit = {
    val person = new Person

    println(person.sex)

    //person.idCard  ===> error 私有属性不能访问
    //person.name  ===> error protected属性不能访问

    println(person.age)
  }
}

//伴生对象(伴生对象和伴生类可以相互访问,没有修饰符的限制)
object Person {
  def main(args: Array[String]): Unit = {

    val person = new Person

    println(person.idCard)

    println(person.name)

    println(person.age)

    println(person.sex)

  }
}

//定义一个类(伴生类)
class Person {
  private var idCard: String = "123123"

  protected var name: String = "alice"

  var sex: String = "female"

  private[chapter06] var age: Int = 18

  def printInfo = {
    println(s"Person:$idCard ===> $name ===> $sex ===> $age")
  }
}
