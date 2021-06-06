package chapter07

/**
 * @author Rainbow
 * @date 2021/6/6 19:18
 * @Desc 多维数组
 */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    //1、创建多维数组
    val array = Array.ofDim[Int](2, 3)

    //添加元素
    array(0)(2) = 23

    //2、访问元素
    for (i <- array.indices; j <- array(i).indices) {
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) {
        println()
      }
    }

    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))
  }
}
