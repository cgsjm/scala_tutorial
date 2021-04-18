package chapter02

/**
 * @author Rainbow
 * @date 2021/4/5 14:37
 *
 */
object Test_String {
  def main(args: Array[String]): Unit = {
    val num: Double = 2.3456
    //第一种方式
    println(s"The num is ${num}")
    //第二种方式
    println(f"The num is ${num}%2.2f")
    //第三种方式
    println(raw"The num is ${num}%2.2f")

    val name: String = "张三"
    val age: Int = 25
    //第四种方式
    val sql =
      s"""
         |select *
         |from student
         |where name = ${name}
         |and age > ${age}
         |""".stripMargin
  }
}
