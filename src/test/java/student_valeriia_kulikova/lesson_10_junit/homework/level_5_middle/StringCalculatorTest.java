package student_valeriia_kulikova.lesson_10_junit.homework.level_5_middle;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
public class StringCalculatorTest {
    @Test
            public void Test1 () {
        StringCalculator test = new StringCalculator();
        String text = "1,2,3,4,5,6,7,8,9,0";
        int expectedResult = 45;
        int realResult = test.add(text);
        assertEquals(expectedResult,realResult);

    }

    @Test
    public void Test2 () {
        StringCalculator test = new StringCalculator();
        String text = "000000";
        int expectedResult = 0;
        int realResult = test.add(text);
        assertEquals(expectedResult,realResult);

    }
    @Test
    public void Test3 () {
        StringCalculator test = new StringCalculator();
        String text = " ";
        int expectedResult = 0;
        int realResult = test.add(text);
        assertEquals(expectedResult,realResult);

    }
    @Test
    public void Test4 () {
        StringCalculator test = new StringCalculator();
        String text = "1,2,3,4,5\n6,7,8,9";
        int expectedResult = 45;
        int realResult = test.add2(text);
        assertEquals(expectedResult,realResult);
    }
    @Test
    public void Test5 () {
        StringCalculator test = new StringCalculator();
        String text = "//[;]\n1;2;3;4;5;6;7;8;9";
        int expectedResult = 45;
        int realResult = test.add3(text);
        assertEquals(expectedResult,realResult);
    }
}
