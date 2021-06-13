package chapter09plus

/**
 * @author Rainbow
 * @date 2021/6/13 13:57
 * @Desc 泛型
 */
object Test03_Generics {
  def main(args: Array[String]): Unit = {
    //1、斜变&&逆变
    val child: Parent = new Child()

    // val childList:MyCollection[Parent] = new MyCollection[Child]  error

    val childList: MyCollection2[Parent] = new MyCollection2[Child]

    // val childList: MyCollection3[Parent] = new MyCollection3[Child] error

    val childList2: MyCollection3[SubChild] = new MyCollection3[Child]

    //2、泛型上下限
    def test[A <: Child](a: A) = {
      println(a.getClass.getName)
    }

//    test[Parent](new Child) error
    test[Child](new SubChild)
    test[Child](new Child)
//    test[SubChild](new Child) error

  }
}

class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

class MyCollection[E] {}

class MyCollection2[+E] {}

class MyCollection3[-E] {}




