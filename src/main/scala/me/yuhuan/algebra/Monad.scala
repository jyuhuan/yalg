package me.yuhuan.algebra

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 10/11/15.
 */
trait Monad[M[_]] {
  def id[X]: X ⇒ M[X]
  def flatMap[X, Y](f: X ⇒ M[Y]): M[Y]
}
