package chapter09plus

/**
 * @author Rainbow
 * @date 2021/6/13 13:28
 *
 */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {

    //1、定义隐式函数
    implicit def covert(num: Int) = new MyRichInt(num)

    println(12.myMax(15))

    println("=========================")

    //2、定义隐式类
    implicit class MyRichInt2(val self: Int) {
      //自定义比较大小的方法
      def myMax2(n: Int) = {
        if (n > self) {
          n
        } else {
          self
        }
      }

      def myMin2(n: Int) = {
        if (n < self) {
          n
        } else {
          self
        }
      }
    }
    println(12.myMax2(15))

    println("=========================")

    println(12.myMin2(15))

    println("=========================")

    //3、隐式参数,底层其实是柯里化（在同一范围内相同类型的隐式参数只能有一个;隐式值会覆盖默认值）
    implicit val str: String = "alice"
    implicit val num: Int = 18

    def sayHello()(implicit name: String) = {
      println("hello," + name)
    }

    def sayHello2()(implicit name: String = "rainbow") = {
      println("hi," + name)
    }

    //简便写法
    def hiAge()() = {
      println("hi," + implicitly[Int])
    }

    sayHello()
    sayHello
    sayHello2()
    sayHello2
    hiAge()
    hiAge
  }
}

//自定义类
class MyRichInt(val self: Int) {
  //自定义比较大小的方法
  def myMax(n: Int) = {
    if (n > self) {
      n
    } else {
      self
    }
  }

  def myMin(n: Int) = {
    if (n < self) {
      n
    } else {
      self
    }
  }
}
