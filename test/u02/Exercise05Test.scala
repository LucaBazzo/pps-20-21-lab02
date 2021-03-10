package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Exercise05Test {

  import u02.Optionals.Option._

  @Test def testFilter(): Unit ={
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
  }

  @Test def testMap(): Unit ={
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(None(), map(None[Int])(_ > 2))
  }

  @Test def testMap2(): Unit ={
    assertEquals(Some(12), map2(Some(5), Some(7))(_ + _))
    assertEquals(None(), map2(Some(5), None())(_ * _))

    assertEquals(Some(false), map2(Some(true), Some(false))(_ && _))
    assertEquals(None(), map2(None(), Some(false))(_ || _))
  }
}
