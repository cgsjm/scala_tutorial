package chapter05

/**
 * @author Rainbow
 * @date 2021/4/5 20:17
 *       闭包
 */
object Test_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def addByA(a: Int): Int => Int = {
      def addByB(b: Int): Int = {
        a + b
      }

      addByB
    }

    //使用匿名函数
    def addByA_Two(a: Int): Int => Int = {
      b => {
        a + b
      }
    }
    //简化
    def addByA_Three(a: Int): Int => Int = {
      a + _
    }

    println(addByA_Three(4)(5))
  }
}
