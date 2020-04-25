package algorithms.array

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

import org.scalatest.{FlatSpec, Matchers}

class SmallestSubArraySpec extends FlatSpec with Matchers {

  it should "execute example test cases" in {
    //given
    val in = new ByteArrayInputStream(
      """3
        |6 51
        |1 4 45 6 0 19
        |5 9
        |1 10 5 2 7
        |5 174
        |58 82 124 130 297
        |""".stripMargin.getBytes
    )
    val out = new ByteArrayOutputStream()

    //when
    SmallestSubArray.run(in, out)
    
    //then
    out.toString shouldBe
      """3
        |1
        |1
        |""".stripMargin
  }
}
