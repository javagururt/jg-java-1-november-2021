package student_andrei_karamnov.lesson_5_arrays_for_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.*/
@CodeReview(approved = true)
class Task_29 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Random array elements: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 999);
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("\nEven elements: ");
        for(int i = 0; i < array.length; i++){
        if(array[i] % 2 == 0){System.out.print(" " + array[i]+ " ");
        }}
    }
}
