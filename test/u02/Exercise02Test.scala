package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Exercise02Test {

  import u02.Exercise02._

  @Test def testParity(){
    assertEquals("odd", parityMethod(1))
    assertEquals("odd", parityFunction(1))

    assertEquals("even", parityMethod(2))
    assertEquals("even", parityFunction(2))

  }

  @Test def testNeg(){
    val empty: String => Boolean = _ == ""
    val notEmpty = negMethod(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))

    val emptyInt: Int => Boolean = _ == 0
    val notEmptyInt = negMethod(emptyInt)
    assertTrue(notEmptyInt(3))
    assertFalse(notEmptyInt(0))
  }

  @Test def testNoCurriedMethType{
    assertTrue(noCurriedMethType(1,2,3))
    assertFalse(noCurriedMethType(3,2,1))
    assertFalse(noCurriedMethType(1,3,2))
  }

  @Test def testNoCurriedFunType{
    assertTrue(noCurriedFunType(1,2,3))
    assertFalse(noCurriedFunType(3,2,1))
    assertFalse(noCurriedFunType(1,3,2))
  }

  @Test def testCurriedMethType{
    assertTrue(curriedMethType(1)(2)(3))
    assertFalse(curriedMethType(3)(2)(1))
    assertFalse(curriedMethType(1)(3)(2))
  }

  @Test def testCurriedFunType{
    assertTrue(curriedFunType(1)(2)(3))
    assertFalse(curriedFunType(3)(2)(1))
    assertFalse(curriedFunType(1)(3)(2))
  }

  @Test def testCompose{
    assertEquals(9,compose(_-1,_*2)(5))

    assertEquals(3,compose(_+3,_-3)(3))
  }

  @Test def testComposeGeneric(){
    assertEquals("ciao come stai?",composeGeneric[String](_ + " stai?" ,_ + " come")("ciao"))

    assertTrue(composeGeneric[Boolean](!_, _ && false)(5 == 5))
  }

}
