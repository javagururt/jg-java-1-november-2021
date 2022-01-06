package student_victor_veselov.lesson_4;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1st");
        int a = scanner.nextInt();
        System.out.println("2nd");
        int b = scanner.nextInt();
        System.out.println("3");
        int c = scanner.nextInt();

        if (a > b && b < c){
            System.out.println(a);
        }
        if (a < b && b < c){
            System.out.println(c);
        }
        if (a > b && b > c){
            System.out.println(b);
        }

    }
}
