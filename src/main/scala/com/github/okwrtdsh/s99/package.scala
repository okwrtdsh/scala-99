package com.github.okwrtdsh

package object S99 {

  /** P01 */
  def last[T](list: List[T]) = list.last

  def last2[T](list: List[T]): T = list match {
    case Nil         => ???
    case head :: Nil => head
    case _ :: tail   => last2(tail)
  }

  def last3[T](list: List[T]): T = list.reduceLeft { (_, e) =>
    e
  }

  /** P02 */
  def penultimate[T](list: List[T]) = list.init.last

  def penultimate2[T](list: List[T]): T = list match {
    case Nil              => ???
    case _ :: Nil         => ???
    case head :: _ :: Nil => head
    case _ :: tail        => penultimate2(tail)
  }

  /** P03 */
  def nth[T](n: Int, list: List[T]) = list(n)

  def nth2[T](n: Int, list: List[T]): T = list match {
    case head :: _ if n == 0 => head
    case head :: tail        => nth2(n - 1, tail)
  }

  /** P04 */
  def length1[T](list: List[T]) = list.length

  def length2[T](list: List[T]): Int = list match {
    case Nil       => 0
    case _ :: tail => 1 + length2(tail)
  }

  def length3[T](list: List[T]) = list.foldLeft(0) { (c, _) =>
    c + 1
  }

  /** P05 */
  def reverse[T](list: List[T]) = list.reverse

  def reverse2[T](list: List[T]): List[T] = list match {
    case Nil          => Nil
    case head :: tail => reverse2(tail) :+ head
  }

  def reverse3[T](list: List[T]) = list.foldLeft(List[T]()) { (l, e) =>
    e +: l
  }

  /** P06 */
  def isPalindrome[T](list: List[T]): Boolean = list match {
    case Nil      => true
    case _ :: Nil => true
    case head :: tail =>
      if (head == tail.last) isPalindrome(tail.init)
      else false
  }

  /** P07 */
  def flatten(list: List[Any]): List[Any] = list.flatMap {
    case l: List[_] => flatten(l)
    case e          => List(e)
  }

  /** P08 */
  def compress[T](list: List[T]) = list.foldLeft(List[T]()) { (l, e) =>
    if (l.isEmpty || l.last != e) l :+ e
    else l
  }

  /** P09 */
  def pack[T](list: List[T]): List[List[T]] = list.foldLeft(List[List[T]]()) {
    (l, e) =>
      if (l.isEmpty || l.last.head != e) l :+ List(e)
      else l.dropRight(1) :+ (l.last :+ e)
  }

  /** P10 */
  def encode[T](list: List[T]): List[(Int, T)] =
    list.foldLeft(List[(Int, T)]()) { (l, e) =>
      if (l.isEmpty || l.last._2 != e) l :+ (1, e)
      else l.dropRight(1) :+ (l.last._1 + 1, e)
    }
}
