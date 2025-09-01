import scala.annotation.tailrec
import scala.jdk.Accumulator

object FactorialUsingRecursion {

  def factorial(n:Int): Int = {
    if(n == 0 | n== 1 ){
      return  1
    }
    else {
      return n * factorial(n-1)
    }
  }


  def factorialTailRecurssion(n:Int): Int = {
    @tailrec
    def fatorialLoop(x:Int, accumulator: Int): Int = {
      if (x == 0 | x == 1) {
        return accumulator
      }
      else {
        return fatorialLoop(x-1, x*accumulator)
      }  
    }
    fatorialLoop(n, 1)
  }
  def main(args:Array[String]): Unit = {
    println("Enter n :")
    val n = scala.io.StdIn.readInt()
    val result  = factorial(n)
    println("factorial of "+n+ " : "+result)
    val result2 = factorialTailRecurssion(n)
    println("tail recursion factorial of "+n+" :"+result2)

  }
}
