object LeapYear {

  def main(args:Array[String]): Unit = {
    var x = "Y"
    while (x != "N"){
      println("Enter year :")
      val year = scala.io.StdIn.readInt()
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("leap year :" + year)
      }
      else {
        println("not leap year :" + year)
      }
      print("Enter y or Y to continue, and N to stop")
      x  = scala.io.StdIn.readLine().toUpperCase()
    }
  }
}
