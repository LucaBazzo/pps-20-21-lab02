package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Exercise04Test {

  import u02.Exercise04._

  val RECTANGLE_HEIGHT = 2.5
  val RECTANGLE_WIDTH = 3.0
  val CIRCLE_RADIUS = 1
  val SQUARE_SIDE = 4.5

  val rectangle = Rectangle(RECTANGLE_HEIGHT,RECTANGLE_WIDTH)
  val circle = Circle(CIRCLE_RADIUS)
  val square = Square(SQUARE_SIDE)

  @Test def testShapeType: Unit ={
    assertEquals("rectangle", shapeType(rectangle))
    assertEquals("circle", shapeType(circle))
    assertEquals("square", shapeType(square))
  }

  @Test def testPerimeter: Unit ={
    assertEquals(11, perimeter(rectangle))
    assertEquals(6.28, perimeter(circle))
    assertEquals(18, perimeter(square))
  }

  @Test def testArea: Unit ={
    assertEquals(7.5, area(rectangle))
    assertEquals(3.14, area(circle))
    assertEquals(20.25, area(square))
  }

}
