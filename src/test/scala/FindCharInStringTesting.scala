import org.scalatest.flatspec.AnyFlatSpec

class FindCharInStringTesting extends AnyFlatSpec {
  "the find a character function" should "throw an error if the number is bigger than the length of the string" in {
    assertThrows[Error](exercices.FindCharInString.findInString("hello",6))
  }
  it should "return the character literal at index n+1" in {
    assert(exercices.FindCharInString.findInString("United Kingdom", 7) == ' ')
    assert(exercices.FindCharInString.findInString("United Kingdom", 9) == 'i')
  }
}
