package student_mihails_nikolajevs.lesson_8_inheritance_.level_4_junior_;

import org.junit.Test;
import student_mihails_nikolajevs.lesson_8.level_4_junior_.Circle;

import static org.junit.Assert.assertEquals;

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
