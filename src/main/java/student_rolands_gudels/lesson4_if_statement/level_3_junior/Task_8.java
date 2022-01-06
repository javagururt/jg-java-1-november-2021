package student_rolands_gudels.lesson4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_8 {
    /*Write a Java program that accepts three numbers and prints:
 -"All numbers are equal" if all three numbers are equal,
 - "All numbers are different" if all three numbers are different
 - "Neither all are equal or different" otherwise.*/
    public static void main(String[] args) {
        System.out.println("Please enter three integer numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x==y&y==z) {
            System.out.println("All numbers are equal");
        } else if  (x!=y&y!=z) {
            System.out.println("All numbers are different");
        } else{
            System.out.println("Neither all are equal or different");
        }
    }
}
