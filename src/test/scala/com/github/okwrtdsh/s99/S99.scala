import com.github.okwrtdsh.S99._
import org.scalatest._

class S99Spec extends FlatSpec with Matchers {

  "P01" should "last" in {
    last(List(1, 1, 2, 3, 5, 8)) should be(8)
  }
  it should "last2" in {
    last2(List(1, 1, 2, 3, 5, 8)) should be(8)
  }
  it should "last3" in {
    last3(List(1, 1, 2, 3, 5, 8)) should be(8)
  }

  "P02" should "penultimate" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should be(5)
  }
  it should "penultimate2" in {
    penultimate2(List(1, 1, 2, 3, 5, 8)) should be(5)
  }

  "P03" should "nth" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) should be(2)
  }
  it should "nth2" in {
    nth2(2, List(1, 1, 2, 3, 5, 8)) should be(2)
  }

  "P04" should "length1" in {
    length1(List(1, 1, 2, 3, 5, 8)) should be(6)
  }
  it should "length2" in {
    length2(List(1, 1, 2, 3, 5, 8)) should be(6)
  }
  it should "length3" in {
    length3(List(1, 1, 2, 3, 5, 8)) should be(6)
  }

  "P05" should "reverse" in {
    reverse(List(1, 1, 2, 3, 5, 8)) should be(List(8, 5, 3, 2, 1, 1))
  }
  it should "reverse2" in {
    reverse2(List(1, 1, 2, 3, 5, 8)) should be(List(8, 5, 3, 2, 1, 1))
  }
  it should "reverse3" in {
    reverse3(List(1, 1, 2, 3, 5, 8)) should be(List(8, 5, 3, 2, 1, 1))
  }
}
