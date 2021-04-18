package chapter05

/**
 * @author Rainbow
 * @date 2021/4/5 17:44
 * 函数作为参数传递
 */
object Test_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 23, 34, 45)

    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    def addOne(elem: Int): Int = {
      elem + 1
    }

    val newArray = arrayOperation(arr, addOne)
    println(newArray.mkString(","))

    val newArray_two = arrayOperation(arr, _ * 2)
    println(newArray_two.mkString(","))
  }
}
