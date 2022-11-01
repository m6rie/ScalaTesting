package exercices

/*
Create a Scala program to find the 8th character in the String: "Jinesh".
Output:
The 3th character literal is n
 */
object FindCharInString extends App {
  def findInString(s:String, n:Int):Char = {
//    println("Number: ")
//    var name: String = "Jinesh"
//    var character: Int = scala.io.StdIn.readInt()
    val NS = s.length+1
    if (n < NS) {
      s(n-1) // because the index starts at 0
    } else throw new Error("The String is not long enough")
  }
  findInString("hello", 5)
}
