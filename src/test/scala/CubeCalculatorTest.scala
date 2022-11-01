import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite {
  test("exercices.CubeCalculator") {
    assert(exercices.CubeCalculator.cubeCalc(5) === 125)
    assert(exercices.CubeCalculator.cubeCalc(1) === 1)
    assert(exercices.CubeCalculator.cubeCalc(2.34) === 12.812903999999998)
  }
}
