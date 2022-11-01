package exercices

object EvenOrOdd extends App {
  def evenOrOdd(number: Int):Unit = {
    if (number % 2 == 0) {
      println("even")
    } else {
      println("odd")
    }
  }
}
