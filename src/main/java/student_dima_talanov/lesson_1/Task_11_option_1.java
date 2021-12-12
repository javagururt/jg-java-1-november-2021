package student_dima_talanov.lesson_1;
import java.util.Scanner;

public class Task_11_option_1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        int second;
        int result;
        System.out.print("Enter first number: "); //74
        first = num.nextInt();
        System.out.print("Enter second number: "); //36
        second = num.nextInt();
        result = (first + second);
        System.out.println("Result is - " + result);
    }
}