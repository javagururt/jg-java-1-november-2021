package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle("Your rectangle", 4, 5);

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