package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait MultiplicativeGroup[X] extends MultiplicativeMonoid[X] {
  def inv(x: X): X
  def div(a: X, b: X): X = mul(a, inv(b))
}
