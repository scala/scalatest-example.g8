/**
  * Created by travislee on 2/2/17.
  */
class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("cube of 3 is 27") {
    assert(CubeCalculator.cube(3) === 27)
  }
}
