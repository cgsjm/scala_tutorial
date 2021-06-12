package chapter08

/**
 * @author Rainbow
 * @date 2021/6/12 23:29
 * @Desc 偏函数
 */
object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {

    val list = List[(String, Int)](("a", 12), ("b", 221), ("c", 2))

    val list1 = list.map(tuple => (tuple._1, tuple._2 * 2))
    println(list1)

    //用模式匹配
    val list2 = list.map((kv: (String, Int)) => {
      kv match {
        case (k, v) => (k, v * 2)
      }
    })
    println(list2)

    //省略lambda表达式的写法,进行简化(偏函数)
    val list3 = list.map {
      case (k, v) => (k, v * 2)
    }
    println(list3)

    //偏函数的应用,求绝对值
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }

    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }

    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int) = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(-67))

  }
}
