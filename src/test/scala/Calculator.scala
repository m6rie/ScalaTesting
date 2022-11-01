import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.propspec.AnyPropSpec
import org.scalatest.refspec.RefSpec
import org.scalatest.wordspec.AnyWordSpec

class Calculator extends AnyFunSuite {
  test("testing the addition function") {
    assert(exercices.Calculator.addition(2,3,4) === 9)
    assert(exercices.Calculator.addition(34,2) === 36)
    assert(exercices.Calculator.addition(54,6,90,4,8) === 162)
  }

  test("testing the subtraction function") {
    assert(exercices.Calculator.subs(78,70) === 8)
    assert(exercices.Calculator.subs(45.3,38) === 7.299999999999997)
    assert(exercices.Calculator.subs(3,38) === -35)
  }

  test("exercices.Calculator.multiply") {
    assert(exercices.Calculator.multiply(2,2) === 4)
    assert(exercices.Calculator.multiply(2,8) === 16)
    assert(exercices.Calculator.multiply(652,0) === 0)
  }

  test("testing the division function") {
    assertThrows[ArithmeticException](exercices.Calculator.divide(45.3,0))
    assert(exercices.Calculator.divide(50,5) === 10)
    assert(exercices.Calculator.divide(89,6) === 14.833333333333334)
//    assert(exercices.Calculator.divide(45.3,0) === 0)
  }
}

// BEHAVIOR DRIVEN DEVELOPMENT
class CalculatorSpec extends AnyFunSpec {
  describe("multiply function") {
    it("should equals to 0 if any of the number is 0") {
      assert(exercices.Calculator.multiply(652, 0) === 0)
    }
    it("should multiply the first number by the second") {
      assert(exercices.Calculator.multiply(2, 2) === 4)
      assert(exercices.Calculator.multiply(2, 8) === 16)
    }
  }

  describe("division function") {
    it("should return an error if divided by 0") {
      assertThrows[ArithmeticException](exercices.Calculator.divide(45.3,0))
      // assert(exercices.Calculator.divide(45.3,0) === 0)
    }
    it("should divide first number by second number") {
      assert(exercices.Calculator.divide(89, 6) === 14.833333333333334)
    }
  }
}

class CalculatorWordSpec extends AnyWordSpec {
  "A calculator" should {
    "give 0 if multiplied by 0" in {
      assert(exercices.Calculator.multiply(652, 0) === 0)
    }
    "throw an error if divided by 0" in {
      assertThrows[ArithmeticException](exercices.Calculator.divide(45.3,0))
    }
    "sum up the numbers for an addition" in {
      assert(exercices.Calculator.addition(34, 2) === 36)
      assert(exercices.Calculator.addition(54, 6, 90, 4, 8) === 162)
    }
  }
}

class CalculatorFreeSpec extends AnyFreeSpec {
  "A calculator" - { // anything you want
    "give 0 if multiplied by 0" in {
      assert(exercices.Calculator.multiply(652, 0) === 0)
    }
    "throw an error if divided by 0" in {
      assertThrows[ArithmeticException](exercices.Calculator.divide(45.3, 0))
    }
    "sum up the numbers for an addition" in {
      assert(exercices.Calculator.addition(34, 2) === 36)
      assert(exercices.Calculator.addition(54, 6, 90, 4, 8) === 162)
    }
  }
}

class CalculatorPropSpec extends AnyPropSpec {
  // perfect for test including lots of examples
  val multiplyByZero = List((876, 0), (0,0), (-876, 0))
  property("Calculator multiply by 0 should be 0") {
    assert(multiplyByZero.forall {
      case (a, b) => exercices.Calculator.multiply(a, b) == 0
    })
  }
  property("Calculator divide by 0 should throw an error") {
    assertThrows[ArithmeticException](exercices.Calculator.divide(45.3, 0))
  }
}

class CalculatorRefSpec extends RefSpec {
  object `A calculator` {
    def `multiply by 0 should be 0`:Unit = {
      assert(exercices.Calculator.multiply(652, 0) === 0)
      assert(exercices.Calculator.multiply(0, 76) === 0)
    }

    def `should sum up the numbers`:Unit = {
      assert(exercices.Calculator.addition(4,8,90) === 102)
    }
  }
}

class CalculatorFlatSpec extends AnyFlatSpec {
  "division function" should "throw an error if a number is 0" in {
    assertThrows[ArithmeticException](exercices.Calculator.divide(45.3, 0))
  }
  it should "throw this error" in {
    assertThrows[ArithmeticException](exercices.Calculator.divide(45.3, 0))
  }
  "subtraction function" should "return a number lower that the first one" in {
    assert(exercices.Calculator.subs(56,40) === 16)
  }
  it should "return negative number if the first number is greater than the second number" in {
    assert(exercices.Calculator.subs(45, 60) === -15)
  }
}