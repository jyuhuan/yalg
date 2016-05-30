package me.yuhuan.algebra

/**
  * @author Yuhuan Jiang (jyuhuan@gmail.com).
  */
trait Ring[@specialized(Double) X] extends Semiring[X] with AdditiveGroup[X]

object Ring {

}