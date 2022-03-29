package student_mihails_nikolajevs.lesson_8_inheritance_.level_4_junior_;

import org.junit.Test;
import student_mihails_nikolajevs.lesson_8.level_4_junior_.Square;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {

    Square square = new Square("Your square:", 5);


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
