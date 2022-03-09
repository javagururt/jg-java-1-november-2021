package student_valeriia_kulikova.lesson_10_junit.homework.level_3_4_junior;
import org.junit.Assert;
import  org.junit.Test;

import java.util.Arrays;

public class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();

    @Test
    public void test1 () {
        boolean [][] testArray = new boolean[5][5];
        testArray[3][3] = true;
        testArray[2][2] = true;
        testArray[3][1] = true;
        testArray[4][1] = true;
        boolean [][] expectedArray = new boolean[5][5];
        expectedArray [2][2] = true;
        expectedArray[3][2] = true;
        expectedArray[3][1] = true;
        testArray = test.calculate(testArray);

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[0].length; j++) {
                System.out.print(testArray[i][j] + "\t"); }
            System.out.println(); }
        System.out.println("*****************************");
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                System.out.print(expectedArray[i][j] + "\t"); }
            System.out.println(); }

        Assert.assertArrayEquals("Test1: ", testArray,expectedArray);

    }
}