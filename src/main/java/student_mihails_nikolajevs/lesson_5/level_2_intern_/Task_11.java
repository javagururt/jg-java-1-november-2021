package student_mihails_nikolajevs.lesson_5.level_2_intern_;
/*
апишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.
 */
import java.util.*;
public class Task_11 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please Enter First Integer Number : ");
        int a = scanner.nextInt();

        System.out.println(" Please Enter Second Integer Number : ");
        int b = scanner.nextInt();

        System.out.println(" Please Enter Third Integer Number :  ");
        int c = scanner.nextInt();

        int[] numbers = {a,b,c};

        System.out.println(" Your Data : ");

        for(int i=0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }


}
