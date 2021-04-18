package chapter06

/**
 * @author Rainbow
 * @date 2021/4/18 20:43
 * @Desc 特质的自身类型
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val alice = new RegisterUser("alice", "123456")
    alice.insert()
  }
}

//用户类
class User(val name: String, val password: String)

//特质(想使用User的属性,而不想继承)
trait UserDao {
  _: User =>
  //向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db:${this.name}")
  }
}

class RegisterUser(name:String,password:String) extends User(name,password) with UserDao
