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
}
