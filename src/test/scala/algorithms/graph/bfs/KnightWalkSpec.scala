package algorithms.graph.bfs

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}
import java.util

import KnightWalk._
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.JavaConverters._

class KnightWalkSpec extends FlatSpec with Matchers {

  it should "find all targets from then given point" in {
    //when & then
    targets(new util.HashSet[Point](), 4, 7, new Point(2, 6)).asScala shouldBe Set(
      new Point(4, 7),
      new Point(4, 5),
      new Point(3, 4),
      new Point(1, 4)
    )
  }
  
  it should "execute example test cases" in {
    //given
    val in = new ByteArrayInputStream(
      """3
        |4 7
        |2 6 2 4
        |4 7
        |2 6 3 4
        |7 13
        |2 8 3 4
        |""".stripMargin.getBytes
    )
    val out = new ByteArrayOutputStream()

    //when
    KnightWalk.run(in, out)
    
    //then
    out.toString shouldBe
      """2
        |1
        |3
        |""".stripMargin
  }
}
