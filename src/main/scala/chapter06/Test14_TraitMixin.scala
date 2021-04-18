package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 20:05
 * @Desc 特质的混入
 */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student14 = new Student14
    student14.study()
    student14.increase()

    student14.play()
    student14.increase()

    student14.dating()
    student14.increase()

    println("================================")

    //动态混入特质(采用匿名子类)
    val studentWithTalent = new Student14 with Talent {
      override def singing(): Unit = {
        println("student is good at singing")
      }

      override def dancing(): Unit = {
        println("student is good at dancing")
      }
    }
    studentWithTalent.sayHello()
    studentWithTalent.play()
    studentWithTalent.study()
    studentWithTalent.dating()
    studentWithTalent.dancing()
    studentWithTalent.singing()

  }
}

//定义一个特质(智慧)
trait Knowledge {
  var amount: Int = 0

  def increase(): Unit

}

//定义一个特质(天赋)
trait Talent {
  def singing(): Unit

  def dancing(): Unit
}

//混入多个特质
class Student14 extends Person13 with Young with Knowledge {

  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法
  override def dating(): Unit = {
    println(s"student $name is dating")
  }

  //自定义方法
  def study(): Unit = {
    println(s"student $name is studying")
  }

  //重写父类的方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from student:$name")
  }

  //实现特质中的抽象方法
  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased:$amount")
  }
}
