/*Given a string val str = "abbabcdexeabc".
Find the substring with max length with non-repeating characters.
Output : "abcdex
*/

object FindMaxNonRepeativeSubString {
  def main(args:Array[String]): Unit = {
    val str = "abbabcdexeabc"
    println(str)
    var maxlength = 0;
    var start = 0;
    var maxstart = 0;
    val seen = scala.collection.mutable.Map[Char, Int]()
    for (end <- str.indices){
      val c = str(end)
      println("val c :" + c)
      if (seen.contains(c) && seen(c) >= start){
        start = seen(c)+1
        println("start :"+start)
      }
      seen(c) = end
      println("seen(c) " +seen(c))
      if (end - start + 1 > maxlength){
        maxlength = end-start+1
        println("maxlength :"+maxlength)
        maxstart = start
        println("maxstart : "+maxstart)
      }
    }
    println(str.substring(maxstart, maxstart+maxlength))
  }
}
