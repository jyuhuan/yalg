package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait MultiplicativeSemigroup[X] {
  def mul(a: X, b: X): X
}
