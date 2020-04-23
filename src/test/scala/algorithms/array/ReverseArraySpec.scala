package algorithms.array

import org.scalatest.{FlatSpec, Matchers}

class ReverseArraySpec extends FlatSpec with Matchers {

  it should "reverse the whole array" in {
    //given
    val arr = Array(1, 2, 3, 4, 5)
    
    //when
    val result = ReverseArray.reverse(arr)
    
    //then
    result.toList shouldBe List(5, 4, 3, 2, 1)
  }
}
