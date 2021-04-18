package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 14:56
 *
 */
object Test02_PackageObject {
  def main(args: Array[String]): Unit = {
    commonMethod()
    println(commonValue)
  }
}

package chapter06 {

  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }

}
