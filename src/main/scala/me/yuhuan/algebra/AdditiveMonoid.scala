package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait AdditiveMonoid[X] extends AdditiveSemigroup[X] {
  def zero: X
}
