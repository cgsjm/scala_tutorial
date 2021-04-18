package chapter04

import scala.util.control.Breaks

/**
 * @author Rainbow
 * @date 2021/4/5 15:45
 *
 */
object Test_ForLoop {
  def main(args: Array[String]): Unit = {
    //1、范围遍历(包含10)
    for (i <- 1 to 10) {
      println(i + ".hello world")
    }

    //1、范围遍历(不包含10)
    for (i <- Range(1, 10)) {
      println(i + ".hello world")
    }

    //1、范围遍历(不包含10),底层就是Range(self,end)
    for (i <- 1 until 10) {
      println(i + ".hello world")
    }

    //2、集合遍历
    for (i <- Array(12, 23, 34)) {
      println(i)
    }

    for (i <- List(12, 23, 34)) {
      println(i)
    }

    for (i <- Set(12, 23, 34)) {
      println(i)
    }

    //3、循环守卫
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    //4、循环步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    //反转
    for (i <- 1 to 10 reverse) {
      println(i)
    }

    //循环嵌套
    for (i <- 1 to 4; j <- 1 to 5) {
      println("i =" + i + ",j = " + j)
    }

    //循环引入变量
    for (i <- 1 to 9; stars = 2 * i - 1; spaces = 9 - i) {
      println(" " * spaces + "*" + stars)
    }

    //循环中断
    //1、采用抛出异常的方式,退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception =>
    }

    //2、使用Scala中的Breaks类的break方法,实现异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )
    println("这是循环外的代码")
  }
}
