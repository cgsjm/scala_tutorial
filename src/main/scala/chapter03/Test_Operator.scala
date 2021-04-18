package chapter03

/**
 * @author Rainbow
 * @date 2021/4/5 15:42
 *
 */
object Test_Operator {
  def main(args: Array[String]): Unit = {
    val b: Short = -13
    println(b << 2)
    println(b >> 2)
    println(b >>> 2)
  }
}
