package student_eduards_puzirevskis.lesson_1.Task_11;

import java.util.Scanner;

public class SummaByYourNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b = scan.nextInt();

        System.out.println("A + B = " + (a+b));

    }
}
