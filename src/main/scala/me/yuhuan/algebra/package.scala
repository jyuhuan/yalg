package me.yuhuan

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
package object algebra {

  implicit class ArithmeticOperationsForEverything[X](val self: X) extends AnyVal {
    def +(that: X)(implicit G: AdditiveSemigroup[X]): X = G.add(self, that)
    def *(that: X)(implicit G: MultiplicativeSemigroup[X]): X = G.mul(self, that)
    def -(that: X)(implicit G: AdditiveGroup[X]): X = G.sub(self, that)
    def /(that: X)(implicit G: MultiplicativeGroup[X]): X = G.div(self, that)
    def ÷(that: X)(implicit G: MultiplicativeGroup[X]): X = /(that)
  }

}
