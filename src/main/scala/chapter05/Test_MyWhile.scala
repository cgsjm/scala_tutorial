package chapter05

/**
 * @author Rainbow
 * @date 2021/4/6 10:35
 *       使用闭包和递归调用自定义while循环
 */
object Test_MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 10
    //1、常规的while循环
    while (n >= 1) {
      println(n)
      n -= 1
    }

    //2、自定义while循环,使用闭包实现一个函数,将代码块作为参数传入,递归调用
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      //内层函数需要递归调用,参数就是循环体
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }

      doLoop
    }

    n = 10
    //如果内层是代码块,可以将小括号省略替换成大括号
    myWhile(n >= 1) {
      println(n)
      n -= 1
    }

    //3、使用柯里化实现
    def myWhile2(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile2(condition)(op)
      }
    }

    n = 10
    //如果内层是代码块,可以将小括号省略替换成大括号
    myWhile2(n >= 1) {
      println(n)
      n -= 1
    }

    //4、使用匿名函数实现
    def myWhile3(condition: => Boolean): (=> Unit) => Unit = {
      //内层函数需要递归调用,参数就是循环体
      op => {
        if (condition) {
          op
          myWhile3(condition)(op)
        }

      }
    }

    n = 10
    myWhile3(n >= 1) {
      println(n)
      n -= 1
    }
  }
}
