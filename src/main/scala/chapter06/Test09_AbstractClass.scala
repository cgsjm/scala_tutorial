package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 18:51
 * @Desc 抽象类
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student09 = new Student09
    student09.eat()
    student09.sleep()
  }
}

//定义抽象类
abstract class Person09 {
  //非抽象属性,使用val修饰
  val name: String = "person"

  //非抽象属性,使用var修饰
  var address: String = "江西"

  //抽象属性,使用var修饰
  var age: Int

  //抽象属性,使用val修饰
  val play: String

  //非抽象方法
  def eat() = {
    println("person eat")
  }

  //抽象方法
  def sleep(): Unit
}

//定义具体的实现子类
class Student09 extends Person09 {
  //实现抽象属性(override可以不写),使用var修饰
  override var age: Int = 18

  //实现抽象属性(override可以不写),使用val修饰,但是此处重写val修饰的变量不报错
  override val play: String = "玩游戏"

  //实现抽象方法(override可以不写)
  override def sleep(): Unit = {
    println("student sleep")
  }

  //重写非抽象属性(override必须写),使用的是val修饰的
  override val name: String = "student"

  //重写非抽象属性(override必须写),使用的是var修饰的
  //override var address: String = "student"  ===> 运行时error,不能override一个可变的变量

  //重写非抽象方法(override必须写)
  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}
