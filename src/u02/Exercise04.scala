package u02

object Exercise04 {

  sealed trait Shape
  case class Rectangle(height:Double, width:Double) extends Shape
  case class Circle(radius:Double) extends Shape
  case class Square(side:Double) extends Shape

  def shapeType(shape:Shape): String = shape match {
      case Rectangle(_,_) => "rectangle"
      case Circle(_) => "circle"
      case Square(_) => "square"
  }

  def perimeter(shape: Shape): Double = shape match {
      case Rectangle(x,y) => (x + y) * 2
      case Circle(r) => 2* r * 3.14
      case Square(l) => l * 4
  }

  def area(shape: Shape): Double = shape match {
      case Rectangle(x,y) => (x * y)
      case Circle(r) => r * r * 3.14
      case Square(l) => l * l
  }

}
