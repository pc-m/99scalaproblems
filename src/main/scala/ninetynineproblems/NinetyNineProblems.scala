package ninetynineproblems

import scala.annotation.tailrec

object NinetyNineProblems {

  def last(l: List[Int]) = l.last

  def penultimate(l: List[Int]) = l.takeRight(2) head

  def nth(n: Int, l: List[Int]) = l(n)

  def length(l: List[Int]) = l length

  def reverse(l: List[Int]) = l reverse

  @tailrec
  def isPalindrome(l: List[Int]): Boolean = {
    if (l.length <= 1) true
    else if (l.head != l.last) false
    else isPalindrome(l.tail.take(l.length - 2))
  }

  def flatten(l: List[Any]): List[Int] = {
    def iter(l: List[Any], acc: List[Int]): List[Int] = l match {
      case Nil => acc
      case (i: Int) :: tail => iter(tail, acc :+ i)
      case (xs: List[Any]) :: tail => iter(tail, iter(xs, acc))
      case _ => acc
    }
    iter(l, List[Int]())
  }
}
