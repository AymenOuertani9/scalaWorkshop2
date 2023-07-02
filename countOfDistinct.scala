import scala.io.StdIn.readLine

object exercise {
  def main(args: Array[String]): Unit = {
    var string_input = readLine()
    val cleaned_string = string_input.replaceAll("[^\\w\\s]", "").toLowerCase

    val words = cleaned_string.split("\\s+")

    val distinct_words = words.toSet
    println(distinct_words)
    val count = distinct_words.size

    print(count)
  }
}
