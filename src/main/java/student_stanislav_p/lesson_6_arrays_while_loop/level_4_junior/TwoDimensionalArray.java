package student_stanislav_p.lesson_6_arrays_while_loop.level_4_junior;

/*
Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.
------------------------------


 */


import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArray {

    int arrayLength1;
    int arrayLength2;
    int bound;


    public int[][] createNewArray(int arrayLength1, int arrayLength2, int bound) {
        this.arrayLength1 = arrayLength1;
        this.arrayLength2 = arrayLength2;
        this.bound = bound;

        int[][] newArray = new int[arrayLength1] [arrayLength2];

        return newArray;
    }


    public void fillArrayWithRandomNumbers(int[][] newArray, int bound) {


        Random random = new Random();

        for (int i = 0; i< newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                newArray[i][j] = random.nextInt(bound);
            }
        }

    }

    public void printArrayToConsole(int[][] newArray) {

        System.out.println("--------------------------------------------");

        System.out.print("      ");
        System.out.print( "  |  ");


        for (int j =0; j < newArray[0].length; j++) {

            System.out.printf("%6d", j);
        }

        System.out.println("");
        System.out.println("--------------------------------------------");

        for (int i = 0; i< newArray.length; i++) {

            System.out.printf("%6d", i);
            System.out.print( "  |  ");

            for (int j = 0; j < newArray[0].length; j++) {

                System.out.printf("%6d", newArray[i][j]);

            }
            System.out.println();
        }

    }

    public int findArraySumm(int[][] newArray) {

        int summOfArray = 0;

        for (int i = 0; i< newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {

                summOfArray=summOfArray+newArray[i][j];
            }
        }

        return summOfArray;
    }


}
