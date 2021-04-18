package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 19:35
 * @Desc 单例对象
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    println(student1)
    println(student2)

    val student3 = Student12_1.getInstance()
    student3.printInfo()
    val student4 = Student12_1.getInstance()
    student4.printInfo()

    println(student3)
    println(student4)
  }
}

class Student12 private(val name: String, val age: Int) {

  def printInfo() = {
    println(s"Student12:name=$name,age=$age,school=${Student12.school}")
  }

}

class Student12_1 private(val name: String, val age: Int) {

  def printInfo() = {
    println(s"Student12_1:name=$name,age=$age,school=${Student12_1.school}")
  }

}

//饿汉式单例模式
object Student12 {
  //相当于将school当做一个静态的属性来看(相当于静态属性)
  val school: String = "江西财经大学"

  private val student: Student12 = new Student12("alice", 12)

  def getInstance(): Student12 = {
    student
  }
}

//懒汉式单例模式
object Student12_1 {
  //相当于将school当做一个静态的属性来看(相当于静态属性)
  val school: String = "江西财经大学"

  private var student: Student12_1 = _

  def getInstance(): Student12_1 = {
    if (student == null) {
      //如果没有对象实例,就创建一个
      student = new Student12_1("bod", 23)
    }
    student
  }

}


