package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait MultiplicativeMonoid[X] extends MultiplicativeSemigroup[X] {
  def one: X
}
