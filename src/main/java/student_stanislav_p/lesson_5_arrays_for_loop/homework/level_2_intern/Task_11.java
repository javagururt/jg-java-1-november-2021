package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_2_intern;



        /*Напишите программу, в которой:
     - создайте массив целых чисел длиной 3,
     - заполните каждую ячейку массива числом, запрошенным у пользователя,
     - выведите значение каждой ячейки на консоль. */


import java.util.Scanner;

public class Task_11 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number #1 ->");
            int a = scanner.nextInt();
            System.out.println("Please enter number #2 ->");
            int b = scanner.nextInt();
            System.out.println("Please enter number #3 ->");
            int c = scanner.nextInt();

            int[] numbers = {a,b,c};

            System.out.println("Your entered  ->");

            for (int i=0; i<numbers.length;i++){
                System.out.println(numbers[i]);
            }
        }


}
