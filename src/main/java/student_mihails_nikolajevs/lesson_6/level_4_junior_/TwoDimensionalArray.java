package student_mihails_nikolajevs.lesson_6.level_4_junior_;
/*
Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.

Помните, что если вы видите часть кода, которую можно реализовать
отдельно от остальной программы, создайте для неё свой метод.
Воспользуйтесь созданным вами методом в основной программе
просто вызвав его. Развивайте и тренеруйте умение разбивать
программу на методы на простых задачах, этот навык вам
в дальнейшем поможет справиться с более сложными задачами.
 */

import java.util.Random;
import java.util.Arrays;

public class TwoDimensionalArray {


    public static void main(String[] args) {

        // Create TwoDimensional Array 3x3 , filled with random numbers from 1 to 10.

        int[][] array = new int[3][3];
        int sum = 0;

        // Fill array with data

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }

        //  Counting All Elements of Array

        for (int i = 0; i < array.length; i++, System.out.println()) {

            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                System.out.println(array[i][j] + " ");
                System.out.println(" The Sum of All Elements of TwoDimensional Array = " + sum);
            }
        }
    }

}
