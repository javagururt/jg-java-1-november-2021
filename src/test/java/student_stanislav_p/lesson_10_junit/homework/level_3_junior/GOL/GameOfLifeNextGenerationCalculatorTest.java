package student_stanislav_p.lesson_10_junit.homework.level_3_junior.GOL;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class GameOfLifeNextGenerationCalculatorTest {

    private GameOfLifeNextGenerationCalculator gameCalculator = new GameOfLifeNextGenerationCalculator();


    @Test
    public void checkCalculator() {


        boolean [][] fieldForGame = {{true},{true}};

        boolean[][] fieldExpectedResult = {{true},{true}};

        boolean [][] fieldActualResult = gameCalculator.calculate(fieldForGame);


        assertArrayEquals(fieldExpectedResult, fieldActualResult);
    }


}