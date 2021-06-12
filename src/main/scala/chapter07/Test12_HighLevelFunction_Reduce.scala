package chapter07

/**
 * @author Rainbow
 * @date 2021/6/12 17:56
 * @Desc 归约函数
 */
object Test12_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    //1、reduce
    val list = List[Int](1, 2, 3, 4)
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))

    println("==========================")

    val list2 = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _)) //-24
    println(list2.reduceLeft(_ - _)) //-24
    println(list2.reduceRight(_ - _)) //6 --> 计算结果： 3 - （4 - （5 - (8 - 10)））

    println("==========================")

    //2、fold
    println(list.fold(10)(_ + _)) //20
    println(list.foldLeft(10)(_ - _)) //0
    println(list2.foldRight(11)(_ - _)) //-5 ---> 计算结果：3 - （4 - （5 - （8 - （10 - 11））））
  }
}
