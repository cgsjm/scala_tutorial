package chapter07

/**
 * @author Rainbow
 * @date 2021/6/6 19:24
 * @Desc 创建不可变的list
 */
object Test04_List {
  def main(args: Array[String]): Unit = {
    //1、创建一个List
    val list1 = List(21, 20, 23)
    println(list1)

    //2、访问和遍历元素
    println(list1(1))
    /*list1(1) = 12 error 不可修改*/

    println("============================")

    //3、添加元素
    val list2 = 10 +: list1 //向前追加
    val list3 = list1 :+ 11 //向后追加
    println(list1)
    println(list2)
    println(list3)

    println("============================")

    //另一种创建不可变队列的方法
    val list6 = 32 :: Nil //向前追加
    val list7 = 17 :: 18 :: 19 :: 20 :: Nil
    println(list6)
    println(list7)

    // 合并List
    val list8 = list6 :: list7
    println(list8) //List(List(32), 17, 18, 19, 20)

    val list9 = list6 ::: list7
    println(list9) //List(32, 17, 18, 19, 20)

    val list10 = list6 ++ list7
    println(list10) //List(32, 17, 18, 19, 20)
  }
}
