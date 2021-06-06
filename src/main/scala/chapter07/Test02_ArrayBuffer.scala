package chapter07

import scala.collection.mutable.ArrayBuffer

/**
 * @author Rainbow
 * @date 2021/6/6 18:57
 * @Desc 创建可变数组
 */
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1、创建可变数组
    val arr1 = new ArrayBuffer[Int]()

    val arr2 = ArrayBuffer[Int](1, 23, 3, 4)

    println(arr1.mkString(","))
    println(arr2)
    println(arr1)

    //2、访问数组中的元素
    println(arr2(0))
    /*println(arr1(0)) error IndexOutOfBoundsException*/

    //3、修改元素
    arr2(0) = 21
    println(arr2(0))

    //4、添加元素
    //往后追加
    val newArr1 = arr1 :+ 15
    println(newArr1)

    arr1 :+ 15
    println(arr1)

    println(newArr1 == arr1)

    arr1 += 15
    println(arr1)

    //把arr1的引用赋给了newArr2,但是不建议使用
    val newArr2 = arr1 += 16
    println(newArr2)

    println(arr1 == newArr2)

    //往前追加
    77 +=: arr1
    println(arr1)
    println(newArr2) //此时改变arr1也会改变newArr2,因为两者引用的地址相同

    //不使用符号添加元素,使用方法添加元素
    //往后添加
    arr1.append(78, 989, 8)
    arr1.appendAll(arr2)

    //往前添加
    arr1.prepend(67)
    arr1.prependAll(arr2)

    //往索引位置插入元素
    arr1.insertAll(1, arr2)
    arr1.insert(0, 23)

    //根据索引删除元素
    arr1.remove(0)
    arr1.remove(1, 10)

    //删除元素值,得用符号,删除的过程中首先会进行查找,没找到则不做任何操作
    arr1 -= 23
    println(arr1)

    //可变数组转换为不可变数组
    val arr = ArrayBuffer[Int](1, 2, 3, 4)
    val newArr = arr.toArray
    println(newArr.mkString(","))
    println(arr)

    //不可变数组转换为可变数组
    val buffer = newArr.toBuffer
    println(buffer)
    println(newArr)

  }
}
