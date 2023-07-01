import scala.io.StdIn.readInt
import scala.util.control.Breaks.break
import scala.util.control.Breaks
import scala.collection.mutable.ListBuffer

object exercise {
  def main(args: Array[String]): Unit = {
    var final_list = ListBuffer[Int]()
    var list = List(1, 2, 3, 2, 3, 4, 3, 4, 5)
    var k = 2
    var ordered_list = list
      .groupBy(el => el)
      .map(e => (e._1, e._2.length))
      .toList
      .sortBy { _._2 }(Ordering[Int].reverse)
    val loop = new Breaks
    for (item <- ordered_list)
      if (final_list.size < k) {
        final_list += item._1
      }
    print(final_list.toList)
  }
}
