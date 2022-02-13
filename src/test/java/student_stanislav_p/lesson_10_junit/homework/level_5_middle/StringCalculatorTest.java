package student_stanislav_p.lesson_10_junit.homework.level_5_middle;

import junit.framework.TestCase;
import org.junit.Test;
import student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.logic.GameOfLifeNextGenerationCalculator;

import static org.junit.Assert.assertArrayEquals;

public class StringCalculatorTest extends TestCase {

    private StringCalculator testCalculator = new StringCalculator();


    @Test
    public void testCalculator1() {


        String numbers = "//[,]\n1,2,3,4,5,6,7,8,9";

        String [] fieldExpectedResult = {"1","2","3","4","5","6","7","8","9"};

        String [] fieldActualResult = testCalculator.stringArray(numbers,",");


        assertArrayEquals(fieldExpectedResult, fieldActualResult);
    }

    @Test
    public void testCalculator2() {


        String [] numbers = {"1","2","3","4","5","6","7","8","9"};

        int [] fieldExpectedResult = {1,2,3,4,5,6,7,8,9};

        int [] fieldActualResult = testCalculator.numbersArray(numbers);


        assertArrayEquals(fieldExpectedResult, fieldActualResult);
    }

    @Test
    public void testCalculator3() {


        String numbers = "//[,]\n1,2,3,4,5,6,7,8,9";

        int  fieldExpectedResult = 45;

        int  fieldActualResult = testCalculator.add(numbers);


        assertEquals(fieldExpectedResult, fieldActualResult);
    }
}