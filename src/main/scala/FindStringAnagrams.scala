import scala.util.control.Breaks.breakable
import scala.util.control.Breaks.break


object FindStringAnagrams {

  def main(args: Array[String]): Unit = {
    println("Enter s1 :")
    val s1 = scala.io.StdIn.readLine()
    println("Enter s2 :")
    val s2 = scala.io.StdIn.readLine()
    val n = s1.length()-1
    val m = s2.length()-1

    if (n != m){
      println("Not Anagrams")
    }
    else {
      val c1 = s1.toCharArray()
      val c2 = s2.toCharArray()
      val d1 = c1.sorted()
      val d2 = c2.sorted()
      var count = 0
      breakable {
        for (i <- 0 to n) {
          if (d1(i) != d2(i)) {
            println("Not Anagrams")
            break
          }
          else{
            count += 1
          }
        }
      }
      println(count)
      if (count == n+1) {
        println("Anagrams")
      }
    }

  }

}
