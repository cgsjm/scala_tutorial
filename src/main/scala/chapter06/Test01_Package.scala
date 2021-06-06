/**
 * @author Rainbow
 * @date 2021/4/18 14:37
 * @Desc 用嵌套风格定义包
 */
package Test01_Package {

  package com {

    import Test01_Package.rainbow.scala.Inner


    //在外层包中定义单例对象
    object Outer {
      var out: String = "out"

      def main(args: Array[String]): Unit = {
        println(Inner.in)
      }
    }

  }

  package rainbow {
    package scala {

      import Test01_Package.com.Outer


      //在内层包中定义单例对象
      object Inner {
        var in: String = "in"

        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }

    }

  }

}


