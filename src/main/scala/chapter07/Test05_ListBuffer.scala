package chapter07

import scala.collection.mutable.ListBuffer

/**
 * @author Rainbow
 * @date 2021/6/12 11:09
 * @Desc 可变列表List
 */
object Test05_ListBuffer {

  def main(args: Array[String]): Unit = {
    // 1、创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 34, 54)

    println(list1) //ListBuffer()
    println(list2) //ListBuffer(12, 34, 54)

    println("=============================")

    //2、添加元素
    list1.append(67, 989)
    list2.prepend(1, 2, 3)

    list1.insert(2, 23, 56, 78)

    println(list1)
    println(list2)

    println("=============================")

    list1 += 5 += 6 += 7 //往后添加元素
    8 +=: 9 +=: list2 //往前添加元素
    println(list1)
    println(list2)

    println("=============================")

    8 +=: 9 +=: list1 += 5 += 6 += 7 //往前后添加元素

    //合并List
    val list3 = list1 ++ list2
    println(list1) //ListBuffer(8, 9, 67, 989, 23, 56, 78, 5, 6, 7, 5, 6, 7)
    println(list2) //ListBuffer(8, 9, 1, 2, 3, 12, 34, 54)
    println(list3) //ListBuffer(8, 9, 67, 989, 23, 56, 78, 5, 6, 7, 5, 6, 7, 8, 9, 1, 2, 3, 12, 34, 54)

    println("=============================")

    list1 ++= list2 //list1往后追加元素
    println(list1) //ListBuffer(8, 9, 67, 989, 23, 56, 78, 5, 6, 7, 5, 6, 7, 8, 9, 1, 2, 3, 12, 34, 54)
    println(list2) //ListBuffer(8, 9, 1, 2, 3, 12, 34, 54)

    println("=============================")
    list1 ++=: list2
    println(list1) //ListBuffer(8, 9, 1, 2, 3, 12, 34, 54)
    println(list2) //ListBuffer(8, 9, 67, 989, 23, 56, 78, 5, 6, 7, 5, 6, 7, 8, 9, 1, 2, 3, 12, 34, 54)

    println("=============================")

    //3、修改元素
    list2(3) = 999999
    println(list2)
    list2.update(0,88888)
    println(list2)

    //4、删除元素
    list2.remove(0,88888) //删除某个索引位置的值
    list2 -= 999999 //删除值
    println(list2)





  }
}
