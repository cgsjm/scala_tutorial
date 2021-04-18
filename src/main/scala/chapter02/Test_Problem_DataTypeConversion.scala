package chapter02

/**
 * @author Rainbow
 * @date 2021/4/5 15:28
 *
 */
object Test_Problem_DataTypeConversion {

  def main(args: Array[String]): Unit = {
    val n: Int = 130
    val b: Byte = n.toByte
    println(b) //-126
  }
}
