package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 16:07
 *
 */
object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student02 = new Student02
    student02.name = "alice"
    student02.age = 12
    println(s"student02:name=${student02.name},age=${student02.age}")

    val student03 = new Student03("bod", 18)
    println(s"student03:name=${student03.name},age=${student03.age}")

    val student04 = new Student04("cary", 21)
    println(student04.printInfo())

    val student05 = new Student05("cary", 21, "江西财经大学")
    println(student05.printInfo())
  }
}

//定义类
//主构器无参构造方法
class Student02 {
  //单独定义属性
  var name: String = _
  var age: Int = _
}

//主构造器有参构造方法
class Student03(var name: String, var age: Int)


//主构造器参数无修饰,此时的name和age只是形参,而不是属性
class Student04(name: String, age: Int) {
  def printInfo() = {
    println(s"student04:name=$name,age=$age")
  }
}

class Student05(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }

  def printInfo() = {
    println(s"Student05:name=$name,age=$age,school=$school")
  }
}
