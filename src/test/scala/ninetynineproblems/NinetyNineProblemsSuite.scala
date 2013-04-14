package ninetynineproblems

import NinetyNineProblems._

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NinetyNineProblemsSuite extends FunSuite {

  test("Problem 1: last") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  test("Problem 2: Last but one") {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  test("Problem 3: nth element of a list") {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) === 2)
  }

  test("Problem 4: Number of elements of a list") {
    assert(length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("Problem 5: Reverse of a list") {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }

  test("Problem 6: Check if a list is a palindrome") {
    assert(isPalindrome(List(1, 2, 3, 2, 1)) === true)
    assert(isPalindrome(List(1, 2, 2, 1)) === true)
    assert(isPalindrome(List(1, 2, 2)) === false)
  }

  test("Problem 7: Flatten a nested list") {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

  test("Problem 8: Eliminate duplicates") {
    assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
           List('a, 'b, 'c, 'a, 'd, 'e))
  }

  test("Problem 9: Pack duplicates") {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("Problem 10: Run-length encoding") {
    assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
                  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
