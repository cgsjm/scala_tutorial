package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 15:52
 * @Desc 构造器使用
 */
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student01 = new Student01()

    student01.student01()

    val alice = new Student01("alice")

    val bod = new Student01("bod", 12)
  }
}

//定义一个类,默认主构造器没有参数
class Student01() {

  //定义属性
  var name: String = _
  var age: Int = _

  println("1、主构造方法被调用")

  //声明辅助构造方法一
  def this(name: String) {
    this() //直接调用主构造器

    println("2、辅助构造方法一被调用")

    this.name = name

    println(s"name:$name ===> age:$age")
  }

  //声明辅助构造方法二
  def this(name: String, age: Int) {
    this(name) //间接调用主构造器

    println("3、辅助构造方法二被调用")

    this.age = age

    println(s"name:$name ===> age:$age")
  }

  //普通方法
  def student01(): Unit ={
    println("普通方法被调用")
  }
}
