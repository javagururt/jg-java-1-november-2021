package student_andrei_karamnov.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.println("Even integer");
        }
        else if (x % 2 != 0){
            System.out.println("Odd integer");
    }
}}
