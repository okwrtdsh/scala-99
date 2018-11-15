import com.github.okwrtdsh.s99.P01.last
import org.scalatest._

class P01Spec extends FlatSpec with Matchers {
  "P01" should "last" in {
    last(List(1, 1, 2, 3, 5, 8)) should be(8)
  }
}
