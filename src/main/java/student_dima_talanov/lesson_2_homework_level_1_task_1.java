package student_dima_talanov;
import java.util.Scanner;

public class lesson_2_homework_level_1_task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first whole num: ");
        int a = scanner.nextInt();
        System.out.print("Enter second whole num: ");
        int b = scanner.nextInt();
        int result1, result2, result3, result4;
        result1 = (a + b);
        result2 = (a - b);
        result3 = (a * b);
        result4 = (a / b);
        System.out.println("сложение " + result1);
        System.out.println("вычитания " + result2);
        System.out.println("умножения " + result3);
        System.out.println("деления " + result4);
    }
}
