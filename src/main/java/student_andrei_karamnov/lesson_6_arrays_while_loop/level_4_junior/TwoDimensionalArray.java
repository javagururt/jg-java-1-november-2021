package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*Создайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.

Помните, что если вы видите часть кода, которую можно реализовать
отдельно от остальной программы, создайте для неё свой метод.
Воспользуйтесь созданным вами методом в основной программе
просто вызвав его. Развивайте и тренеруйте умение разбивать
программу на методы на простых задачах, этот навык вам
в дальнейшем поможет справиться с более сложными задачами.*/
@CodeReview(approved = true)
class TwoDimensionalArray {
    public static void main(String[] args) {
        
        int[][] twoDimArray = new int[3][4];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
            }
        }
        TwoDimArrayUtil twoDimArrayUtil = new TwoDimArrayUtil();
        twoDimArrayUtil.fillTwoDimArrayWithRandomNumbers(twoDimArray);
        twoDimArrayUtil.printTwoDimArrayToConsole(twoDimArray);

        System.out.println("Сумма всех элементов двумерного массива = "+ twoDimArrayUtil.findSumOfElementsInTwoDimArray(twoDimArray));
    }
}
