package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 20:18
 * @Desc 特质的叠加
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student15 = new Student15
    student15.increase()

    //砖石问题,特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())

  }
}

//定义一个特质(智慧)
trait Knowledge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("Knowledge15 increased")
  }

}

//定义一个特质(天赋)
trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("Talent15 increased")
  }
}

//定义球类特征
trait Ball {
  def describe(): String = "ball"
}

//定义颜色特征
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = {
    color + "-" + super.describe()
  }
}

//定义种类特征
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = {
    category + "-" + super.describe()
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def singing(): Unit = {
    println("student is good at singing")
  }

  override def dancing(): Unit = {
    println("student is good at dancing")
  }

  //冲突的方法;解决的方法:需要重写。(砖石问题,叠加顺序:从右向左)
  //super调用的是最后一个特质中的方法
  //没有super,则调用自己的方法
  override def increase(): Unit = {
    super.increase()
    //可以改变叠加顺序
    super[Person13].increase()
  }
}

//定义一个自定义的球类(砖石问题,叠加顺序:从右向左)
class MyFootBall extends CategoryBall with ColorBall {

  override def describe(): String = {
    "my ball is a" + super.describe()
  }
}
