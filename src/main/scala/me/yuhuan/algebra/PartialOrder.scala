package me.yuhuan.algebra

import scala.{specialized ⇒ sp}

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 6/6/15.
 */
// some other useful symbols: ⪰ ⪯ ≤ ≥
trait PartialOrder[@sp(Int, Double) -T] {
  def ≼(a: T, b: T): Boolean
  def ≽(a: T, b: T) = ≼(b, a)
  def ⇔(a: T, b: T) = ≼(a, b) && ≽(a, b)
  def ≺(a: T, b: T) = ≼(a, b) && ! ≼(b, a)
  def ≻(a: T, b: T) = ≽(a, b) && ! ≽(b, a)
}

object PartialOrder {
  def by[X, @sp(Int, Double) Y](f: X ⇒ Y)(implicit o: PartialOrder[Y]) = new PartialOrder[X] {
    override def ≼(a: X, b: X): Boolean = o.≼(f(a), f(b))
  }
}
