package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait AdditiveSemigroup[X] {
  def add(a: X, b: X): X
}
