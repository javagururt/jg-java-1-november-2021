package student_andrei_karamnov.lesson_4_if_statement.level_1_intern;

import javax.swing.*;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.util.Scanner;

class Task_1 {


    public static void main(String[] args) {
            System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0){
            System.out.println("Positive integer");
        }
        else if (x < 0){
            System.out.println("Negative integer");
        }
        else if (x == 0){
            System.out.println("Integer equals 0");
        }
    }}
