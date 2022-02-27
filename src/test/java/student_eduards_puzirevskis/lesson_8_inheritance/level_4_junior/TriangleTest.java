package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle = new Triangle("Your triangle", 4);

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