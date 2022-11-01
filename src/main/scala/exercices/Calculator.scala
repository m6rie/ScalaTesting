package exercices

object Calculator {
  def addition(x:Double*):Double = {
    x.sum
  }

  def subs(x:Double,y:Double):Double = {
    x-y
  }

  def multiply(v:Double, s:Double):Double = {
      v*s
  }

  def divide(g:Double, h:Double):Double = {
    if(g == 0 || h == 0) {
      throw new ArithmeticException("Cannot divide by 0")
    } else {
      g / h
    }
  }
}
