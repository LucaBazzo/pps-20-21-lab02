package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Exercise03Test {

  import u02.Exercise03._

  @Test def testFibonacci(){
    assertEquals(0, (fibonacci(0)))
    assertEquals(1, (fibonacci(1)))
    assertEquals(1, (fibonacci(2)))
    assertEquals(2, (fibonacci(3)))
    assertEquals(3, (fibonacci(4)))
    assertEquals(5, (fibonacci(5)))
  }

  @Test def testFibonacciTail(){
    assertEquals(0, (fibonacciTail(0)))
    assertEquals(1, (fibonacciTail(1)))
    assertEquals(1, (fibonacciTail(2)))
    assertEquals(2, (fibonacciTail(3)))
    assertEquals(3, (fibonacciTail(4)))
    assertEquals(5, (fibonacciTail(5)))
  }

}
