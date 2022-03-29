package student_mihails_nikolajevs.lesson_8_inheritance_.level_4_junior_;

import org.junit.Test;
import student_mihails_nikolajevs.lesson_8.level_4_junior_.Rectangle;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

     Rectangle rectangle = new Rectangle("Your rectangle", 4,5);

     @Test
     public void calculateArea() {
         double actual = rectangle.calculateArea();
         double expected = 20;

         assertEquals(expected, actual, 0.0001);
     }

     @Test
     public void calculatePerimeter() {
         double actual = rectangle.calculatePerimeter();
         double expected = 18;

         assertEquals(expected, actual, 0.0001);

     }
}

