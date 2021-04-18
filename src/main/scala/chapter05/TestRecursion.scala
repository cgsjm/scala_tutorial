package chapter05

import scala.annotation.tailrec

/**
 * @author Rainbow
 * @date 2021/4/5 20:51
 *       递归阶乘
 */
object TestRecursion {
  def main(args: Array[String]): Unit = {
    //for循环
    def factorial(n: Int): Int = {
      var result: Int = 1
      for (i <- 1 to n) {
        result *= i
      }
      result
    }

    println(factorial(5))

    //递归执行(底层是栈叠加,效率不好)
    def fact(n: Int): Int = {
      if (n == 0) {
        return 1
      }
      fact(n - 1) * n
    }

    println(fact(5))

    //(尾递归)实现(底层是栈覆盖,而不是栈叠加)
    def tailFact(n: Int): Int = {
      @tailrec
      def loop(n: Int, result: Int): Int = {
        if (n == 0) {
          return result
        }
        loop(n - 1, result * n)
      }

      loop(n, 1)
    }
  }
}
