package chapter07

/**
 * @author Rainbow
 * @date 2021/6/12 21:48
 * @Desc 并行处理
 */
object Test15_Parallel {
  def main(args: Array[String]): Unit = {
    val result = (1 to 100).map(
      x => Thread.currentThread().getName
    )
    println(result)

    println("==============================")

    val result2 = (1 to 100).par.map(
      x => Thread.currentThread().getName
    )
    println(result2)
  }
}
