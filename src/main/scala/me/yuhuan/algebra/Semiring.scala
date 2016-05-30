package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait Semiring[@specialized(Double) X] extends AdditiveMonoid[X] with MultiplicativeMonoid[X]

object Semiring {

  object forInt extends Semiring[Int] {
    def one: Int = 1
    def zero: Int = 0
    def add(a: Int, b: Int): Int = a + b
    def mul(a: Int, b: Int): Int = a * b
  }

  object forDouble extends Semiring[Double] {
    def add(a: Double, b: Double) = a + b
    def mul(a: Double, b: Double) = a * b
    def one = 1.0
    def zero = 0.0
  }

}

object SemiringTest extends App {



  val bp = 0
}