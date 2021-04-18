package chapter05

/**
 * @author Rainbow
 * @date 2021/4/5 21:15
 *       控制抽象(值传递、名传递)
 */
object Test_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1、传值参数
    def f0(a: Int): Unit = {
      println("a:+" + a)
      println("a:+" + a)
    }
    def f1(): Int = {
      println("f1调用")
      12
    }

    f0(f1())
    println("===============================")

    //  2、传名参数,传递的不再是具体的值,而是代码块
    def f2(a: => Int): Unit = {
      println("a:+" + a)
      println("a:+" + a)
    }
    f2(f1())
    f2(23)
  }
}
