package student_victor_veselov.lesson_4;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1st");
        int a = scanner.nextInt();
        System.out.println("2nd");
        int b = scanner.nextInt();
        System.out.println("3rd");
        int c = scanner.nextInt();

        if (a < b && b < c){
            System.out.println("Numbers sorted " + a + " " + b + " " + c);
        }
        if (a < b && b > c){
            System.out.println("Numbers sorted " + a + " " + c + " " + b);
        }
        if (a > b && b > c){
            System.out.println("Numbers sorted " + c + " " + b + " " + a);
        }
        if (a > b && b < c){
            System.out.println("Numbers sorted " + b + " " + a + " " + c);
        }



    }
}
