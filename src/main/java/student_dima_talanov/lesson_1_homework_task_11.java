package student_dima_talanov;
import java.util.Scanner;

public class lesson_1_homework_task_11 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: "); //74
        first = num.nextInt();
        System.out.print("Enter second num: "); //36
        second = num.nextInt();
        result = (first + second);
        System.out.println("Result is - " + result);
    }
}
