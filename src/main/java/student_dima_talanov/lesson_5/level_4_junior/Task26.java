//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива.

package student_dima_talanov.lesson_5.level_4_junior;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {
        int arrayLength;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter my array length: ");
        arrayLength = scanner.nextInt();

        int myArray[] = new int[10];
        System.out.println("First random array number: ");
        myArray[0] = (int) (Math.random() * 10);
        System.out.println(myArray[0]);
        System.out.println("Second random array number: ");
        myArray[1] = (int) (Math.random() * 15);
        System.out.println(myArray[1]);
        System.out.println("Third random array number: ");
        myArray[2] = (int) (Math.random() * 20);
        System.out.println(myArray[2]);
        System.out.println("First random array number: ");
        myArray[0] = (int) (Math.random() * 10);
        System.out.println(myArray[0]);
        System.out.println("Second random array number: ");
        myArray[1] = (int) (Math.random() * 15);
        System.out.println(myArray[1]);
        System.out.println("Third random array number: ");
        myArray[2] = (int) (Math.random() * 20);
        System.out.println(myArray[2]);
    }

}
