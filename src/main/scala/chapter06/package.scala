/**
 * @author Rainbow
 * @date 2021/4/18 14:51
 * @Desc 1、包对象的名称必须和包名相同且包对象和所处的包必须在同一层级下
 *       2、该包对象中定义的属性和方法必须得chapter06包下的类和对象才能访问
 */
package object chapter06 {
  //定义当前包共享的属性和方法
  val commonValue = "Rainbow"

  def commonMethod() = {
    println(s"我们的${commonValue}弟弟")
  }
}
