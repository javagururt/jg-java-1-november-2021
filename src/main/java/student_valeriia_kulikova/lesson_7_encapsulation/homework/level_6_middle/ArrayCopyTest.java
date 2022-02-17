package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int numberFrom = 3;
        int numberTo = 7;
        int[] testArray2 = {3, 4, 5, 6, 7};
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] result = arrayCopy.copyInRange(testArray, numberFrom, numberTo);
        System.out.println(Arrays.toString(arrayCopy.copyInRange(testArray, numberFrom, numberTo)));

        boolean copyResult = Arrays.equals(testArray2,result);
        if (copyResult) {
            System.out.println("Test 1 is OK");
        } else {
            System.out.println("Test 1 is FAIL.");
        }

        int [] testArray3 = {3,5,6,7,8};
        boolean copyResult2 = Arrays.equals(testArray3,result);
        if (copyResult2) {
            System.out.println("Test 2 is FAIL");
        } else {
            System.out.println("Test 2 is OK.");
        }

        int [] testArray4 = {7,6,5,4};
        boolean copyResult3 = Arrays.equals(testArray4,result);
        if (copyResult3) {
            System.out.println("Test 3 is FAIL");
        } else {
            System.out.println("Test 3 is OK.");
        }
    }
    }

