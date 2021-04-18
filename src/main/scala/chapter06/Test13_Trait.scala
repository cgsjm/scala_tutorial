package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 19:53
 * @Desc 特质
 */
object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student13 = new Student13
    student13.sayHello()
    student13.study
    student13.dating()
    student13.play()
  }
}

//定义一个父类
class Person13 {
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit = {
    println("hello from " + name)
  }

  def increase(): Unit = {
    println("Person13 increased")
  }
}

//定义一个特质
trait Young {
  //声明抽象和非抽象属性
  var age: Int
  val name: String = "Young"

  //声明抽象和非抽象方法
  def play(): Unit = {
    println(s"young people $name is playing")
  }
  def dating(): Unit
}

class Student13 extends Person13 with Young {

  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法
  override def dating(): Unit = {
    println(s"student $name is dating")
  }

  //自定义方法
  def study: Unit = {
    println(s"student $name is studying")
  }

  //重写父类的方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from student:$name")
  }
}
