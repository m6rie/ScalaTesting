package exercices

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
object Anagram extends App {
  def anagram(t: String, s: String):Boolean = {
    var tList = t.replaceAll("\\s", "").toLowerCase().sorted
    var sList = s.replaceAll("\\s", "").toLowerCase().sorted

    if (tList == sList) {
      true
    } else {
      false
    }
  }
}
