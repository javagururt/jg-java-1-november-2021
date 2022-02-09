package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_4_junior;


import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    public int [][]  createArray () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number from 1 to 10:");
        int x = sc.nextInt();
        System.out.println("Please, enter a number from 1 to 10:");
        int y = sc.nextInt();


        int[][] array = new int[x][y];

        return array;
    }

    public int [][]  fillArray (int [][] array) {

        int a = 1;
        int b = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = a + (int) (Math.random() * b);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        return array;
    }

    public int sumOfArray (int [][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum = sum + array [i][j];
            }
        }
        return sum;
    }

}