import org.scalatest.funsuite.AnyFunSuite

class AnagramTesting extends AnyFunSuite {
  test("exercices.Anagram.anagram") {
    assert(exercices.Anagram.anagram("car","arc") === true)
    assert(exercices.Anagram.anagram("anAmam", "amAanM") === true)
    assert(exercices.Anagram.anagram("car","art") === false)
    assert(exercices.Anagram.anagram("heavy fridge","latest laptop") === false)
    assert(exercices.Anagram.anagram("Ig pranked him","parking dheim") === true)
    assert(exercices.Anagram.anagram("o n e","ONE") === true)  }
}
