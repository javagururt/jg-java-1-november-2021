package student_dima_talanov.lesson_2.level_3_junior;
import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int third = scanner.nextInt();
        float result = (first + second + third)  / 3;
        System.out.println("Result is = " + result);
    }
}

