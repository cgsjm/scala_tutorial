package chapter07

/**
 * @author Rainbow
 * @date 2021/6/6 19:24
 * @Desc 创建不可变的list
 */
object Test04_list {
  def main(args: Array[String]): Unit = {
    //1、创建一个List
    val list1 = List(21, 20, 23)
    println(list1)

    //2、访问和遍历元素
    println(list1(1))
    /*list1(1) = 12 error 不可修改*/
  }
}
