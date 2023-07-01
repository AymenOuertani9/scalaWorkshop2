object exercise {
    def main(args : Array[String]) : Unit = {
        var list  = List("apple" , "banana" , "cherry" , "banana" , "apple" , "date" , "apple")
        var ordered_list =list.groupBy(el => el).map(e => (e._1, e._2.length)).toList.sortBy{_._2}(Ordering[Int].reverse)
        print(ordered_list.head.head)

    }
}