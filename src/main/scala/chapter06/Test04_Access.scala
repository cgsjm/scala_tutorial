package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 15:22
 * @Desc 访问权限
 */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    //创建Person对象
    val person = new Person

    //person.idCard  ===> error 私有属性无法访问

    println(person.age)
    println(person.sex)

    //person.name  ===> error protected修饰的属性只能在自己当前类及伴生对象和子类中访问,外部不能访问

    println(person.printInfo)

    //创建Worker对象
    val worker = new Worker

    //打印更改之后的对象
    println(worker.printInfo)
  }
}

//定义一个子类
class Worker extends Person {

  //重写父类的方法
  override def printInfo: Unit = {
    //println(idCard) ===> error 私有的属性只能在自己的类中或伴生对象中使用,子类不能访问
    name = "Bob"
    sex = "sale"
    age = 20
    println(s"Worker:$name ===> $sex ===> $age")
  }

}
