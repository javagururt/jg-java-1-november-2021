package student_andrei_karamnov.lesson_4_if_statement.level_2_intern;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {
        System.out.println("Please enter two integers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y){
            System.out.println(y);
        }
        else if (x < y){
            System.out.println(x);
        }
    }
}
