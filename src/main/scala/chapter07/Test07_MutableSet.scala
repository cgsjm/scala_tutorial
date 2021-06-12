package chapter07

import scala.collection.mutable

/**
 * @author Rainbow
 * @date 2021/6/12 12:48
 * @Desc 创建可变集合Set
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //1、创建可变Set集合
    val set1 = mutable.Set[Int](12, 21, 22,12)
    println(set1)

    println("=======================")

    //2、添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)

    println("=======================")

    set1 += 13
    println(set1)

    println("=======================")

    val bool = set1.add(14)
    println(set1)
    println(bool) //true

    println("=======================")

    val bool2 = set1.add(14)
    println(set1)
    println(bool2) //false

    //3、删除元素
    set1 -= 14
    println(set1)
    set1.remove(22)

    //4、合并Set集合
    val set3 = mutable.Set(1,2,3,4)
    println(set1)
    println(set3)

    println("================================")

    val set4 = set1 ++ set3
    println(set1)
    println(set3) //Set(1, 2, 3, 4)
    println(set4) //Set(12, 1, 13, 2, 21, 3, 4)

    println("================================")

    set1 ++= set3
    println(set1) //Set(12, 1, 13, 2, 21, 3, 4)
    println(set3) //Set(1, 2, 3, 4)

  }
}
