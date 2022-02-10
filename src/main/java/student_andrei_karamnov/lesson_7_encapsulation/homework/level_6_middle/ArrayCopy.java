package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

/*Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int numberFrom, int numberTo)

Данный метод должен вернуть новый массив, который содержит
только те числа, которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нём.

Логику необходимо реализовать в отдельном классе ArrayCopy.

Написать тестовые сценарии для класса ArrayCopy в классе ArrayCopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/
@CodeReview(approved = true)
@CodeReviewComment(comment = "переменные которые не используются должны быть удалены")
class ArrayCopy {
private int[] in;
private int numberFrom;
private int numberTo;

    public ArrayCopy(int[] in, int numberFrom, int numberTo) {
        this.in = in;
        this.numberFrom = numberFrom;
        this.numberTo = numberTo;
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                //System.out.println(Arrays.toString(in));
                //System.out.println("range index: " + i + " number: " + in[i]);
                count++;
            }
    }
        int finalArray[] = new int[count];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
               // System.out.println(Arrays.toString(in));
                // System.out.println("range index: " + i + " number: " + in[i]);
                finalArray[index] = in[i];
                index++;
            }
            //System.out.println(Arrays.toString(finalArray));
        }
        return finalArray;
}
}
