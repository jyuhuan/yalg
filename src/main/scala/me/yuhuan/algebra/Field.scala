package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait Field[@specialized(Double) X] extends Ring[X] with MultiplicativeGroup[X]

object Field {

  object forDouble extends Field[Double] {
    def one: Double = 1.0
    def zero: Double = 0.0
    def inv(x: Double): Double = 1.0 / x
    def neg(x: Double): Double = -x
    def add(a: Double, b: Double): Double = a + b
    def mul(a: Double, b: Double): Double = a * b
  }

}