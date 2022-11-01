import org.scalatest.flatspec.AnyFlatSpec

class EvenOrOdd extends AnyFlatSpec{
  "the function evenOrOdd" should "print odd for odd numbers" in {
    assert(exercices.EvenOrOdd.evenOrOdd(13) === println("odd"))
  }
  it should "print even for even number" in {
    assert(exercices.EvenOrOdd.evenOrOdd(34) === println("even"))
  }
}
