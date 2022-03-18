package student_eduards_puzirevskis.lesson_10_junit.level_5_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    StringCalculator test = new StringCalculator();

    @Test
    public void shouldReturnZero() {
        int actual = test.add("");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOne() {
        int actual = test.add("1,0");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFive() {
        int actual = test.add("2,3");
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFiftyFive() {
        int actual = test.add("1,2,3,4,5,6,7,8,9,10");
        int expected = 55;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAfterNewLine() {
        int actual = test.add("1\n23,4");
        int expected = 28;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAfterNewLineSecond() {
        int actual = test.add("1\n\n\n");
        int expected = 1;
        assertEquals(expected, actual);
    }

}