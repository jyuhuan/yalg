package me.yuhuan.algebra

/**
 * @author Yuhuan Jiang (jyuhuan@gmail.com).
 */
trait Equality[-T] {
  def eq(x: T, y: T): Boolean
  def ne(x: T, y: T): Boolean = !eq(x, y)
}
