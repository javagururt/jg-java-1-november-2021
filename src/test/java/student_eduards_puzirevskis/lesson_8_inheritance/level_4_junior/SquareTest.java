package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square square = new Square("Your square", 5);

    @Test
    public void calculateArea() {
        double actual = square.calculateArea();
        double expected = 25;

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void calculatePerimeter() {
        double actual = square.calculatePerimeter();
        double expected = 20;

        assertEquals(expected, actual, 0.001);

    }
}