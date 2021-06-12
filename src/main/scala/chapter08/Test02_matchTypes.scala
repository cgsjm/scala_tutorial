package chapter08

/**
 * @author Rainbow
 * @date 2021/6/12 22:08
 *
 */
object Test02_matchTypes {
  def main(args: Array[String]): Unit = {
    //1、匹配常量
    def describeConst(x: Any) = {
      x match {
        case 1 => "Int one"
        case "hello" => "String Hello"
        case true => "Boolean"
        case '+' => "Char"
      }
    }

    //2、匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int" + i
      case s: String => "String" + s
      case list: List[String] => "List[String]" + list
      case array: Array[Int] => "Array[Int]" + array.mkString(",")
      case _ => "类型不匹配"
    }

    //3、匹配数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 20, 30)
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        case Array(x, y) => "Array:" + x + "," + y //匹配两元素的数组
        case Array(0, _*) => "以0开头的数组" //以0开头的数组
        case Array(x, 1, z) => "中间为1的三元素数组"
        case _ => "something else"
      }
      println(result)
    }

    //4、匹配列表
    val list = List[Int](1, 2, 3, 4)
    val result = list match {
      case first :: second :: rest => s"first: $first,second: $second,rest: $rest"
      case _ => "something else"
    }
    println(result)

    //5、匹配元组
    for (tuple <- List(
      (0),
      (1, 0),
      (0, 1, 0),
      (1, 1, 0),
      (2, 3, 7, 15),
      ("hello", 20, 30)
    )) {
      val result = tuple match {
        case (a, b) => "" + a + "," + b
        case (0, _) => "(0, _) "
        case (a, 1, _) => "(a, 1,_) " + a
        case _ => "something else"
      }
      println(result)
    }
  }
}
