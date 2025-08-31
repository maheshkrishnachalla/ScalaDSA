object FactorialUsingRecursion {

  def factorial(n:Int): Int = {
    if(n == 0 | n== 1 ){
      return  1
    }
    else {
      return n * factorial(n-1)
    }
  }

  def main(args:Array[String]): Unit = {
    println("Enter n :")
    val n = scala.io.StdIn.readInt()
    val result  = factorial(n)
    println("factorial of "+n+ " : "+result)

  }
}
