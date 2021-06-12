package chapter07

import scala.collection.mutable

/**
 * @author Rainbow
 * @date 2021/6/12 21:21
 * @Desc 合并map
 */
object Test13_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = Map("a" -> 2, "b" -> 3, "c" -> 4, "d" -> 5)
    println(map1 ++ map2) //Map(a -> 2, b -> 3, c -> 4, d -> 5)

    println("==============================")

    val map3 = mutable.Map("a" -> 2, "b" -> 3, "c" -> 4, "d" -> 5)
    val map4 = map1.foldLeft(map3) {
      (mergeMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergeMap(key) = mergeMap.getOrElse(key, 0) + value
        mergeMap
      }
    }
    println(map4)

  }
}
