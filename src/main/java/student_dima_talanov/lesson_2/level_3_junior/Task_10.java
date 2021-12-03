package student_dima_talanov.lesson_2.level_3_junior;
import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args){
        System.out.print("Radius");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextFloat(); // 7.5
        double Pi = 3.141592653589793238462643383279502;
        double result1 = 2 * a * Pi;
        double result2 = Pi * a * a;
        System.out.println("Perimeter is = " + result1);
        System.out.println("Area is = " + result2);
    }
}
