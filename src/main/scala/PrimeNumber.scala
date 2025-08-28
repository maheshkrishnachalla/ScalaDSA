import scala.util.control.Breaks._

object PrimeNumber {
  def main(args: Array[String]): Unit = {
    println("Enter number :")
    var n = scala.io.StdIn.readInt()
    var x = math.sqrt(n).toInt + 1
    var count = 0
    breakable {
      for (i <- 3 to x by 2) {
        if (n % i == 0) {
           break
        }
        else{
          count += 1
        }
      }
    }
    if (count >= 1) {
      println("Not Prime Number")
    }
    else{
      println("Prime Number")
    }
  }
}
