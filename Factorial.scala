import scala.math.BigInt

object Factorial extends App {
  def factorial(i: Int, f: BigInt): BigInt = 
  i match{
  case 0 => f 
  case _ => factorial(i-1,i*f)
  }

  println(factorial(10000, 1))
}
