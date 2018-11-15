import com.github.okwrtdsh.s99.P02.penultimate
import org.scalatest._

class P02Spec extends FlatSpec with Matchers {
  "P02" should "penultimate" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should be(5)
  }
}

