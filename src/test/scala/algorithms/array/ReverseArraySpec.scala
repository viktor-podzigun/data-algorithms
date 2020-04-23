package algorithms.array

import algorithms.array.ReverseArray._
import org.scalatest.{FlatSpec, Matchers}

class ReverseArraySpec extends FlatSpec with Matchers {

  it should "reverse the whole array" in {
    //when & then
    reverse(Array[Int]()) shouldBe Nil
    reverse(Array(1)) shouldBe List(1)
    reverse(Array(1, 2)) shouldBe List(2, 1)
    reverse(Array(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
  }
  
  it should "reverse part of the array" in {
    //when & then
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 0, 0) shouldBe List(1, 2, 3, 4, 5, 6, 7)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 0, 1) shouldBe List(1, 2, 3, 4, 5, 6, 7)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 0, 2) shouldBe List(2, 1, 3, 4, 5, 6, 7)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 0, 3) shouldBe List(3, 2, 1, 4, 5, 6, 7)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 1, 2) shouldBe List(1, 3, 2, 4, 5, 6, 7)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 1, 4) shouldBe List(1, 5, 4, 3, 2, 6, 7)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 5, 2) shouldBe List(1, 2, 3, 4, 5, 7, 6)
    reverse(Array(1, 2, 3, 4, 5, 6, 7), 6, 0) shouldBe List(1, 2, 3, 4, 5, 6, 7)
  }
}
