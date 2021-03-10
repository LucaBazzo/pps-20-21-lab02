package u02

object Exercise02 {

  def parityMethod(value:Int): String = value match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  val parityFunction: Int => String = {
      case n if n % 2 == 0 => "even"
      case _ => "odd"
  }

  def negMethod[A](f: A => Boolean): A => Boolean = (x:A) => !f(x)

  val negFunction: (String => Boolean) => (String => Boolean) = ???

  def noCurriedMethType(x:Int, y:Int, z:Int): Boolean = x<=y && y<=z

  val noCurriedFunType = (x:Int, y:Int, z:Int) => x<=y && y<=z

  def curriedMethType(x:Int)(y:Int)(z:Int): Boolean = x<=y && y<=z

  val curriedFunType: Int => Int => Int => Boolean = x => y => z => x<=y && y<=z

  def compose(f: (Int => Int), g: Int => Int): Int => Int = f compose g

  def composeGeneric[A](f: (A => A), g: A => A): A => A = f compose g




}
