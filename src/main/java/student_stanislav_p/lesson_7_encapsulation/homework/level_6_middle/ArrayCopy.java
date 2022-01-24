package student_stanislav_p.lesson_7_encapsulation.homework.level_6_middle;

/*
Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int numberFrom, int numberTo)

Данный метод должен вернуть новый массив, который содержит
только те числа, которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нём.

Логику необходимо реализовать в отдельном классе ArrayCopy.

Написать тестовые сценарии для класса ArrayCopy в классе ArrayCopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayCopy {

    int numberFrom;
    int numberTo;
    int [] controlArray;

    public ArrayCopy(int[] in, int numberFrom, int numberTo) {

        this.controlArray = in;
        this.numberFrom = numberFrom;
        this.numberTo=numberTo;
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {

        int arrayControlTrigger;

        if (numberFrom<=numberTo) arrayControlTrigger=1; else arrayControlTrigger=0;

        int count = 0;

        for (int i = 0; i < in.length; i++) {
            if ((numberFrom <= in[i]) && (in[i] <= numberTo)) count++;
        }

        if (arrayControlTrigger*count == 0) count = 1;

        int[] rangeArray = new int[count];

        count = 0;

        for (int i = 0; i < in.length; i++) {
            if ((numberFrom <= in[i]) && (in[i] <= numberTo)) {
                rangeArray[count] = in[i];
                count++;
            }
        }


        return rangeArray;


    }

}
