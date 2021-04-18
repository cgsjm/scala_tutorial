package chapter05

/**
 * @author Rainbow
 * @date 2021/4/5 19:56
 *       函数作为返回值返回
 */
object Test_Practice {
  def main(args: Array[String]): Unit = {
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }

        f2
      }

      f1
    }

    println(func(0)("")('0'))

    //使用函数的柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func(0)("")('0'))
  }
}
