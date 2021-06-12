package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @author Rainbow
 * @date 2021/6/12 21:34
 * @Desc 队列
 */
object Test14_Queue {
  def main(args: Array[String]): Unit = {
    //1、创建一个可变的队列
    val queue = new mutable.Queue[String]()
    //入队
    queue.enqueue("a", "b", "c")
    println(queue)

    //出队 --> 先进先出
    val str = queue.dequeue
    println(str)

    println("=============================")

    //2、创建不可变队列
    val queue2 = Queue("a", "b", "c")
    //入队
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)

    //出队
    println(queue3.dequeue)


  }
}
