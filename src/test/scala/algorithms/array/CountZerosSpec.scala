package algorithms.array

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

import org.scalatest.{FlatSpec, Matchers}

class CountZerosSpec extends FlatSpec with Matchers {

  it should "execute example test cases" in {
    //given
    val in = new ByteArrayInputStream(
      """3
        |12
        |1 1 1 1 1 1 1 1 1 0 0 0 
        |5
        |0 0 0 0 0
        |6
        |1 1 1 1 1 1
        |""".stripMargin.getBytes
    )
    val out = new ByteArrayOutputStream()

    //when
    CountZeros.run(in, out)
    
    //then
    out.toString shouldBe
      """3
        |5
        |0
        |""".stripMargin
  }
}
