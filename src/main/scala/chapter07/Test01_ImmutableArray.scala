package chapter07

/**
 * @author Rainbow
 * @date 2021/6/6 18:35
 * @Desc 创建不可变数组，不可变指的是引用的对象而不是其位置的值
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1、创建不可变的数组
    val arr = new Array[Int](5)

    //2、另一种创建方式,使用的是apply()方法进行创建
    val arr2 = Array(12, 23, 43)

    //3、访问元素
    println(arr2(0))
    println(arr(0)) //值为0

    //4、修改元素
    arr2(0) = 21
    println(arr2(0))

    //打印
    println(arr2) //打印的是地址
    println(arr) //打印的是地址

    println("=================================")

    //5、数组的遍历
    //普通for循环
    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }

    for (i <- arr2.indices) {
      println(arr2(i))
    }

    //增强for循环遍历
    for (elem <- arr2) {
      println(elem)
    }

    //使用迭代器
    val iterator = arr2.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }

    //调用foreach()方法
    arr2.foreach((elem: Int) => println(elem))
    arr2.foreach(println)

    //将数组中的值转换成字符串,拼接起来
    val str = arr2.mkString(",")
    println(str)

    //6、使用符号添加元素,穿件一个新的对象,然后再进行操作对象
    val newArr = arr2 :+ 23 //往后添加元素
    println(arr2.mkString(","))
    println(newArr.mkString(","))

    val newArr2 = 24 +: newArr //往前添加元素
    println(newArr2)
    println(newArr)

    //连续追加元素
    val newArr3 = 21 +: 22 +: 23 +: newArr2
    val newArr4 = newArr3 :+ 23 :+ 24 :+ 25
    println(newArr)
    println(newArr2)
    println(newArr3)
    println(newArr4)
  }
}
