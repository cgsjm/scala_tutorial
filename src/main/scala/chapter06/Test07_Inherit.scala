package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 16:48
 * @Desc 继承
 */
object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student01 = new Student07("alice", 18)
    val student02 = new Student07("bod", 20,"std001")

    student01.printInfo()
    student02.printInfo()
  }
}

//定义父类
class Person07() {
  var name: String = _
  var age: Int = _
  println("1、父类的主构器调用")

  def this(name: String, age: Int) {
    this()
    println("2、父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo() = {
    println(s"Person07:$name , $age")
  }
}

//定义子类
class Student07(name: String, age: Int) extends Person07 {

  var stdNo: String = _

  println("3、子类的主构器调用")

  def this(name: String, age: Int, stdNo: String) {
    this(name, age)
    println("4、子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student07:$name , $age, $stdNo")
  }
}
