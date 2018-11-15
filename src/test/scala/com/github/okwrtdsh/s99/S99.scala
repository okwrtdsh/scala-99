import com.github.okwrtdsh.S99._
import org.scalatest._

class S99Spec extends FlatSpec with Matchers {

  "P01" should "last" in {
    last(List(1, 1, 2, 3, 5, 8)) should be(8)
  }

  "P02" should "penultimate" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should be(5)
  }
}
