package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
@CodeReview(approved = true)
class Task_30 {
    public static void main(String[] args) {
        System.out.println("Alright, let's create random array.");
        int[] yourArray = new int[(int)(Math.random()*10)];
        System.out.println("Your random array is: ");
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = (int)(Math.random()*100);
            System.out.print(" " + yourArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Your random array odd numbers are: ");
        for (int i = 0; i < yourArray.length; i++) {
            if (yourArray[i] % 2 == 1) {
                System.out.print(" " + yourArray[i] + " ");
            }
        }
    }
}
