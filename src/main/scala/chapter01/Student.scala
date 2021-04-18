package chapter01

/**
 * @author Rainbow
 * @date 2021/4/5 14:07
 *
 */
class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

/*引入伴生对象*/
object Student {
  val school: String = "rainbow"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bbb = new Student("bbb", 23)

    alice.printInfo()
    bbb.printInfo()
  }
}
