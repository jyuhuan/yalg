package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
object Ops {
  implicit class IterableOps[X](val xs: Iterable[X]) extends AnyVal {
    def Σ(implicit X: AdditiveMonoid[X]) = xs.foldLeft(X.zero)(X.add)
  }



}
