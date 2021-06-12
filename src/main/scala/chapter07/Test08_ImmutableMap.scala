package chapter07

/**
 * @author Rainbow
 * @date 2021/6/12 14:23
 * @Desc 创建不可变的Map
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //1、创建不可变的Map
    val map1 = Map[String, Int]("a" -> 3, "b" -> 4)
    println(map1)
    println(map1.getClass)

    println("==========================")

    //2、遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => {
      println(kv)
    })

    println("==========================")

    //3、访问元素
    for (key <- map1.keys) {
      println(s"$key ---> ${map1.get(key)}")
    }

    println("==========================")

    //4、访问某一个key的Value
    println(map1.get("a").get)
    println(map1.get("c")) //None
    println(map1.getOrElse("c",0)) //0

    println(map1("a")) //3
    println(map1("c")) //抛异常

  }
}
