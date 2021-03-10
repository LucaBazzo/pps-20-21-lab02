package u02

object Exercise03 {

  def fibonacci(n: Int): Int = n match {
      case 0 | 1 => n
      case _ => fibonacci(n-1) + fibonacci(n-2)
  }

  def fibonacciTail(n: Int): Int = {
    @annotation.tailrec
    def fib(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fib(n - 1, b, a + b)
    }
    fib(n, 0 , 1)
  }

}
