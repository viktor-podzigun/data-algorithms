package algorithms.array

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

import algorithms.array.RotateArray._
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

  it should "execute example test cases" in {
    //given
    val in = new ByteArrayInputStream(
      """2
        |5 2
        |1 2 3 4 5 
        |10 3
        |2 4 6 8 10 12 14 16 18 20
        |""".stripMargin.getBytes
    )
    val out = new ByteArrayOutputStream()

    //when
    RotateArray.run(in, out)
    
    //then
    out.toString shouldBe
      """3 4 5 1 2
        |8 10 12 14 16 18 20 2 4 6
        |""".stripMargin
  }
}
