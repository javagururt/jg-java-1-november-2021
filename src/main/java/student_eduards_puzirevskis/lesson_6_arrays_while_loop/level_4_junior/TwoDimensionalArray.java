package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_4_junior;

import java.util.Arrays;
import java.util.Random;

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
 class TwoDimensionalArray {
  public static void main(String[] args) {

   TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
   int[][] newArray = twoDimensionalArray.createTwoDimensionalArray(4, 4);
   twoDimensionalArray.fillArrayWithRandomNumbers(newArray);
   twoDimensionalArray.printArray(newArray);
   System.out.println("Sum is " + twoDimensionalArray.calculateSum(newArray));
  }


  public int[][] createTwoDimensionalArray(int RowCount,int columnCount) {
   return new int[RowCount][columnCount];
  }

  public void fillArrayWithRandomNumbers(int[][] array) {
   Random random = new Random();
   for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
     array[i][j] = random.nextInt(20);
    }
   }
  }

  public void printArray(int[][] array) {
   System.out.println("Your array is: " + Arrays.deepToString(array));
  }

  public int calculateSum(int[][] array) {
   int sum = 0;
   for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
     sum+= array[i][j];
    }
   }
   return sum;
  }
}
