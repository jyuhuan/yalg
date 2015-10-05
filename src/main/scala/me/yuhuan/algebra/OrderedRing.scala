package me.yuhuan.algebra

/**
 * @author Yuhuan Jiang (jyuhuan@gmail.com).
 */
trait OrderedRing[@specialized(Double, Int) X] extends Ring[X] with PartialOrder[X] {

}
