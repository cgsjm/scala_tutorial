package chapter05

/**
 * @author Rainbow
 * @date 2021/4/5 16:37
 *       函数参数的特殊用法
 */
object Test_FunctionParameter {
  def main(args: Array[String]): Unit = {
    def f4(name: String = "rainbow", age: Int): Unit = {
      println(s"${age}岁的${name}在学习")
    }

    f4("body", 21)
    f4(age = 21, name = "hello")
    f4(age = 23)
  }
}
