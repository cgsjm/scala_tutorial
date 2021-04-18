package chapter05

/**
 * @author Rainbow
 * @date 2021/4/5 17:18
 *
 */
object Test_HighOrderFunction {
  def main(args: Array[String]): Unit = {

    //1、函数作为值传递
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }
    val f1 = f _
    val f2: Int => Int = f

    println(f1)
    println("=================")
    println(f1(123))
    println("=================")
    println(f2)
    println("=================")
    println(f2(123))

    //2、函数作为参数进行传递
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }
    def add(a: Int, b: Int): Int = {
      a + b
    }
    val sum = dualEval(add, 1, 2)
    println(sum)

    //3、函数作为函数的返回值返回
    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6调用" + a)
      }

      f6
    }

    println(f5()(12))
  }
}
