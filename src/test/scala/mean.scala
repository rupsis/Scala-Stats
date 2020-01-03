import org.scalatest._
import io.rupsis.Stats._

class mean extends FlatSpec{
  it should "returns the correct mean" in {
    assert(Seq[Double](5, 5, 5, 5).mean === 5.0)
  }
}
