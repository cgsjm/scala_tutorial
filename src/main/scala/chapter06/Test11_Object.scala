package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 19:17
 * @Desc 伴生类&&伴生对象
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
    val student11 = new Student11("alice", 18)
    student11.printInfo()

    val student11_1 = Student11_1.newStudent11_1("bod", 20)
    student11_1.printInfo()

    val bodStudent11_1 = Student11_1.apply("bod", 21)
    bodStudent11_1.printInfo()

    //使用apply方法创建
    val bodStudent11_2 = Student11_1("bod", 22)
    bodStudent11_2.printInfo()
  }
}

//定义类,主构造器没有私有化
class Student11(val name: String, val age: Int) {

  def printInfo() = {
    println(s"Student11:name=$name,age=$age,school=${Student11.school}")
  }

}

//定义类,主构造器私有化
class Student11_1 private(val name: String, val age: Int) {

  def printInfo() = {
    println(s"Student11_1:name=$name,age=$age,school=${Student11_1.school}")
  }

}

//定义伴生对象(主构造器没有私有化)
object Student11 {
  //相当于将school当做一个静态的属性来看
  val school: String = "江西财经大学"
}

//定义伴生对象(主构造器私有化)
object Student11_1 {
  //相当于将school当做一个静态的属性来看(相当于静态属性)
  val school: String = "江西财经大学"

  //定义一个类的对象实例的创建方法(相当于静态方法)
  def newStudent11_1(name: String, age: Int): Student11_1 = {
    new Student11_1(name, age)
  }

  //可以简化创建
  def apply(name: String, age: Int): Student11_1 = {
    new Student11_1(name, age)
  }
}
