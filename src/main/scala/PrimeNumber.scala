import scala.util.control.Breaks._

object PrimeNumber {
  def main(args: Array[String]): Unit = {
    println("Enter number :")
    //var n = scala.io.StdIn.readInt()
    var primes = 0
    for (n <- 999417 to 999419) {
      var x = math.sqrt(n).toInt
      var count = 0
      breakable {
        for (i <- 2 to x) {
          if (n % i == 0) {
            count += 1
            break
          }
        }
      }
      if (count >= 1) {
        println("Not Prime Number :"+n)
      }
      else {
        primes += 1
        println("Prime Number :"+n)
      }
    }
    println("Primes count :"+primes)
  }
}
