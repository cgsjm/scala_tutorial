package chapter07

/**
 * @author Rainbow
 * @date 2021/6/12 12:35
 * @Desc 创建不可变集合Set
 */
object Test06_ImmutableSet {

  def main(args: Array[String]): Unit = {
    //1、创建Set
    val set1 = Set[Int](13, 23, 45, 23)
    println(set1) //会去除重复的值

    println("===========================")

    //2、添加元素(本身是无序的,并不用关心朝哪个方向去添加元素)
    val set2 = set1.+(20)
    val set3 = set1 + 30
    println(set1)
    println(set2)
    println(set3)

    println("===========================")

    //3、合并两个集合Set
    val set4 = set1 ++ set2
    println(set1)
    println(set2)
    println(set4)

    println("===========================")

    //4、删除元素
    val set5 = set4 - 20
    println(set4)
    println(set5)
  }
}
