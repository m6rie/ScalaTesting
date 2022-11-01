package exercices

object IsPrime extends App {
  def isPrime(num: Int):Boolean = {
    if(num > 2) {
      (2 to (num - 1)).forall(x => num % x != 0)
    } else {
      false
    }
  }
}
