package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle = new Circle("First Circle", 3);

    @Test
    public void shouldCalculateCircleArea() {
       double actual = circle.calculateArea();
       double expected = 28.2743338815;

       assertEquals(expected,actual, 0.0001);
    }

    @Test
    public void shouldCalculateCirclePerimeter() {
        double actual = circle.calculatePerimeter();
        double expected = 18.849555921;

        assertEquals(expected,actual, 0.0001);
    }

}