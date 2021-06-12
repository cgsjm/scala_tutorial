package chapter07

/**
 * @author Rainbow
 * @date 2021/6/12 15:18
 * @Desc map函数
 */
object Test11_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List[Int](1, 2, 3, 4, 5, 6, 7, 8, 9)

    //1、过滤、选取偶数
    val evenList = list.filter((elem: Int) => {
      elem % 2 == 0
    })
    println(evenList)

    //2、map操作
    //把集合中每个数乘2
    println(list.map(elem => elem * 2))

    //3、扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(6, 7, 8))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    val flatList2 = nestedList.flatten
    println(flatList2)

    //4、扁平映射
    val strings = List("hello world", "hello scala", "hello java", "hello C++")
    val splitList = strings.map(elem => elem.split(" ")) //分词
    val flattenList = splitList.flatten // 打散扁平化
    println(flattenList)

    println("===============================")

    val flatMapList = strings.flatMap(elem => elem.split(" "))
    println(flatMapList)

    println("===============================")

    //5、group by 分组操作
    val groupMap = list.groupBy(elem => {
      if (elem % 2 == 0) {
        "偶数"
      } else {
        "奇数"
      }
    })
    println(groupMap)

    println("===============================")

    val wordList = List("china", "america", "alice", "canada", "cary", "bob")
    println(wordList.groupBy(_.charAt(0)))
  }
}
