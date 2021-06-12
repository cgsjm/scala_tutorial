package chapter07

/**
 * @author Rainbow
 * @date 2021/6/12 15:06
 * @Desc 元组
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    //1、创建元祖
    val tuple = ("Hello",100,'a',true)
    println(tuple)

    //2、访问元组中的数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    println(tuple.productElement(0))
    println(tuple.productElement(1))
    println(tuple.productElement(2))
    println(tuple.productElement(3))

    //3、遍历元组的数据
    for(elem <- tuple.productIterator){
      println(elem)
    }

    //4、嵌套元组
    val mulTuple = (12,0.3,"hello",(23,"scala"),56)
    println(mulTuple._4._1)
    println(mulTuple._4._2)
  }

}
