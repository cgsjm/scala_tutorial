package chapter08

/**
 * @author Rainbow
 * @date 2021/6/12 23:20
 * @Desc 样例类
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student1 = Student1("alice", 18)

    val result = student1 match {
      case Student1("alice", 18) => "alice, 18"
      case _ => "else"
    }
    println(result)
  }
}

//定义样例类
case class Student1(name: String, age: Int)
