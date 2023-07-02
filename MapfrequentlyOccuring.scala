import scala.io.StdIn.readInt
import scala.util.control.Breaks.break
import scala.util.control.Breaks
import scala.collection.mutable.ListBuffer

object exercise {
  def main(args: Array[String]): Unit = {
    var final_list = ListBuffer[Int]()
    var map = Map("Alice" -> 80, "Bob" -> 90, "Charlie" -> 75, "David" -> 85)
    var k = 2
    var ordered_list = map.toList.sortBy { _._2 }(Ordering[Int].reverse).take(k)
    print(ordered_list)
  }
}
