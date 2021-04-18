package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 17:11
 * @Desc 多态(Scala中的方法和属性都是动态绑定)
 */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student08: Person08 = new Student08
    println(student08.name)
    student08.hello()
  }
}

class Person08 {
  val name: String = "person"

  def hello() = {
    println("hello person")
  }

}

class Student08 extends Person08 {
  override val name: String = "student"

  override def hello() = {
    println("hello student")
  }
}
