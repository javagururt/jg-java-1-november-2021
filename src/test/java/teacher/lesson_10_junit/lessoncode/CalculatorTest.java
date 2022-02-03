package teacher.lesson_10_junit.lessoncode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldSum() {
        int a = 5;
        int b = 10;
        int expected = 15;
        int actual = calculator.sum(a, b);

        assertEquals(expected, actual);
    }
}