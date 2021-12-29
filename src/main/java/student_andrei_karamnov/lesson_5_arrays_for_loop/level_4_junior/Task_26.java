package student_andrei_karamnov.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Scanner;

/*Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.*/
class Task_26 {
    public static void main(String[] args) {
        System.out.println("Please enter the length of the array: ");
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        for (int i = 0; i < array.length; i++){
        array[i] = (int)(Math.random() * 999);
        }
        System.out.println("Random array elements: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(" " + array[i]);
    }
}}
