package student_dima_talanov;
import java.util.Scanner;

public class lesson_1_homework_task_11_1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: "); //50
        first = num.nextInt();
        System.out.print("Enter second num: "); //3
        second = num.nextInt();
        result = (first / second);
        System.out.println("Result is - " + result);
    }
}