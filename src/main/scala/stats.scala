package io.rupsis

object Stats{

  implicit class StatOperations[T: Fractional](x: Iterable[T]) {
    private val fract = implicitly[Fractional[T]]

    def mean[T] =  fract.div(x.sum, fract.fromInt(x.size))
  }

}

