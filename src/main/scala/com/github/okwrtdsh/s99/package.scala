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
}
