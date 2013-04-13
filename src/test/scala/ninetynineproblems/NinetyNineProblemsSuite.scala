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
}
