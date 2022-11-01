import org.scalatest.flatspec.AnyFlatSpec

class IsPrime extends AnyFlatSpec{
  "if the number is a prime number the function" should "return true" in {
    assert(exercices.IsPrime.isPrime(67) === true)
    assert(exercices.IsPrime.isPrime(29) === true)
    assert(exercices.IsPrime.isPrime(41) === true)
  }
  it should "return false if the number is not prime" in {
    assert(exercices.IsPrime.isPrime(44) === false)
  }
  it should "return false if the number is negative" in {
    assert(exercices.IsPrime.isPrime(-67) === false)
    assert(exercices.IsPrime.isPrime(-29) === false)
    assert(exercices.IsPrime.isPrime(-28) === false)
  }
  it should "return false for 0 and 1" in {
    assert(exercices.IsPrime.isPrime(1) === false)
    assert(exercices.IsPrime.isPrime(0) === false)
  }
}
