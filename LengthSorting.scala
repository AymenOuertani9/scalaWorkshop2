import scala.compiletime.ops.string
object exercise {
  def main(args: Array[String]): Unit = {
    var input_string = List("apple", "banana", "date", "cherry", "fig")
    print(input_string.sortBy(_.length)(Ordering[Int].reverse))

  }
}
