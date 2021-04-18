package chapter06

import scala.beans.BeanProperty

/**
 * @author Rainbow
 * @date 2021/4/18 15:07
 * @Desc 类
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {

    //创建对象
    val student = new Student

    println(student.name)

    //student.salary ===>error,不能访问private修饰的属性

    println(student.address)

    student.eat = "烤肠"
    println(student.eat)

  }
}

//定义一个类(默认修饰符就是public,不用添加public,否则会报错)
class Student {

  //定义属性(默认修饰符就是public,不用添加public,否则会报错)
  var name: String = "alice"
  var age: Int = 18
  var sex: String = "sale"

  //定义私有属性
  private var salary: Int = 12000

  //实现JavaBean中的get/set方法
  @BeanProperty
  var address: String = "江西"

  //定义初值为空的属性(必须为var不能是val)
  var eat: String = _

}
