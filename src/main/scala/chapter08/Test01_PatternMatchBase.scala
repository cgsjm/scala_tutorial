package chapter08

/**
 * @author Rainbow
 * @date 2021/6/12 21:55
 * @Desc 模式匹配
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //1、模式匹配基本定义语法
    val x = 2
    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    println(y)

    //2、用模式匹配实现简单的二元运算
    val a = 25
    val b = 3

    def matchDualOp(op: Char) = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => a % b
    }

    println(matchDualOp('+'))

    println("========================")

    //3、模式守卫
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
    println(abs(1))
    println(abs(-1))
  }
}
