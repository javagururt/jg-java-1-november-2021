//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите все чётные числа в массиве и выведети их на консоль.

package student_dima_talanov.lesson_5.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task29 {

    public static void main(String[] args) {
        int myArray[] = new int[10];
        System.out.println("My array number is: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 30);
            System.out.print(myArray[i] + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Even array number is:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.print(" ");
                System.out.print(myArray[i] + ", ");
            }
        }
    }
}