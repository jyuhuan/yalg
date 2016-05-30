package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait AdditiveGroup[X] extends AdditiveMonoid[X] {
  def neg(x: X): X
  def sub(a: X, b: X): X = add(a, neg(b))
}
