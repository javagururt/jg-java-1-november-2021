package student_rolands_gudels.lesson4_if_statement.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    /*Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.*/
    public static void main(String[] args) {
        System.out.println("Please enter three integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x>y&y>z) {
            System.out.println("decreasing");
        } else if  (x<y&y<z) {
            System.out.println("increasing");
        } else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
