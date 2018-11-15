package com.github.okwrtdsh

package object S99 {
  /** P01 */
  def last[T](list: List[T]) = list.last

  /** P02 */
  def penultimate[T](list: List[T]) = list.init.last
}
