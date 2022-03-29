package student_mihails_nikolajevs.lesson_8_inheritance_.level_4_junior_;

import org.junit.Test;
import student_mihails_nikolajevs.lesson_8.level_4_junior_.Triangle;

import static junit.framework.TestCase.assertEquals;

public class TriangleTest {

     Triangle triangle = new Triangle("Your Triangle", 4);

     @Test
     public void calculateArea() {
         double actual = triangle.calculateArea();
         double expected = 6.9282032303;

         assertEquals(expected, actual, 0.00001);
     }

     @Test
     public void calculatePerimeter() {
         double actual = triangle.calculatePerimeter();
         double expected = 12;

         assertEquals(expected, actual, 0.0001);
     }
}
