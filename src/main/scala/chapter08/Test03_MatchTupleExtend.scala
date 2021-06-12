package chapter08

/**
 * @author Rainbow
 * @date 2021/6/12 22:53
 *
 */
object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    //1、在变量声明时匹配
    val (x, y) = (10, "hello")
    println(s"x: $x,y:$y")

    val List(fir, sec, _) = List(1, 2, 3, 4)
    println(s"first: $fir,second: $sec")

    val first :: second :: rest = List(1, 2, 3, 4)
    println(s"first: $first,second: $second,rest: $rest")

    //2、for推导式中进行模式匹配
    val list = List[(String, Int)](("a", 1), ("b", 2), ("c", 3))

    //基本遍历方式
    for (elem <- list) {
      println(elem._1 + "--->" + elem._2)
    }
    //将list的元素直接定义为元组,对变量赋值
    for ((x, y) <- list) {
      println(x + "--->" + y)
    }
    //只遍历key或者value
    for ((k, _) <- list) {
      println(k)
    }

    //可以指定某个key,找其value
    for (("a", v) <- list) {
      println(v)
    }
  }
}

