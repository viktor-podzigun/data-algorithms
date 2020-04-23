package algorithms.array

import RotateArray._
import org.scalatest.{FlatSpec, Matchers}

class RotateArraySpec extends FlatSpec with Matchers {

  it should "rotate array elements" in {
    //when & then
    rotate(Array[Int](), 1) shouldBe Nil
    rotate(Array(1), 1) shouldBe List(1)
    rotate(Array(1, 2), 0) shouldBe List(1, 2)
    rotate(Array(1, 2), 1) shouldBe List(2, 1)
    rotate(Array(1, 2), 2) shouldBe List(1, 2)
    rotate(Array(1, 2), 3) shouldBe List(2, 1)
    rotate(Array(1, 2), 4) shouldBe List(1, 2)
    rotate(Array(1, 2, 3, 4, 5), 0) shouldBe List(1, 2, 3, 4, 5)
    rotate(Array(1, 2, 3, 4, 5), 1) shouldBe List(2, 3, 4, 5, 1)
    rotate(Array(1, 2, 3, 4, 5), 2) shouldBe List(3, 4, 5, 1, 2)
    rotate(Array(1, 2, 3, 4, 5), 3) shouldBe List(4, 5, 1, 2, 3)
    rotate(Array(1, 2, 3, 4, 5), 4) shouldBe List(5, 1, 2, 3, 4)
    rotate(Array(1, 2, 3, 4, 5), 5) shouldBe List(1, 2, 3, 4, 5)
    rotate(Array(1, 2, 3, 4, 5), 6) shouldBe List(2, 3, 4, 5, 1)
  }
}
