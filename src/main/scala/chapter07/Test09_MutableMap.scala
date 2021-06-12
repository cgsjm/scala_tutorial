package chapter07

import scala.collection.mutable

/**
 * @author Rainbow
 * @date 2021/6/12 14:43
 * @Desc 创建可变的Map
 */
object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    //1、创建可变的Map
    val map1 = mutable.Map[String, Int]("a" -> 3, "b" -> 4)
    println(map1)
    println(map1.getClass)

    println("====================")

    //2、添加元素
    map1.put("c", 5)
    map1.put("d", 6)
    println(map1)

    println("====================")

    map1 += (("e", 7))
    println(map1)

    println("====================")

    //3、删除元素
    map1.remove("a")
    map1 -= "b"
    println(map1)

    println("====================")

    //4、修改元素
    map1.update("a", 3) //没有该元素则为添加元素
    map1.put("d", 7) //有元素则为修改
    println(map1)

    println("====================")

    //5、合并map
    val map2 = Map[String, Int]("a" -> 888, "b" -> 999) //不可变的Map
    map1 ++= map2 //把map2中的元素添加到map1中,如果map1中有map2中的元素则为覆盖,否则为添加元素
    println(map1) //Map(e -> 7, b -> 999, d -> 7, a -> 888, c -> 5)
    println(map2) //Map(a -> 888, b -> 999)

    //map2 ++= map1 //error,因为map2是不可变的map
    println("====================")


    val map3 = map2 ++ map1
    println(map3) //Map(e -> 7, b -> 999, d -> 7, a -> 888, c -> 5)


  }

}
