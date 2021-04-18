package chapter05

/**
 * @author Rainbow
 * @date 2021/4/9 21:13
 *
 */
object Test_Lazy {

  def sum(i: Int, i1: Int): Int = {
    println("3、sum调用")
    i + i1
  }

  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(12, 13)
    
    println("1、函数调用")
    println("2、result = " + result)
  }
}
