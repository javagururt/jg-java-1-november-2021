package student_andrei_karamnov.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please enter three integers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x == y && x == z && y == z ){
            System.out.println("All numbers are equal");
        }
        else if (x != y && x != z && y != z){
            System.out.println("All numbers are different");
        }
        else if (x == y || x== z || y != z){
            System.out.println("Neither all are equal or different");
        }
        else  if (x != y || x != z || y == z){
            System.out.println("Neither all are equal or different");
        }
        else if (x == y || x != z || y == z){
            System.out.println("Neither all are equal or different");
        }
    }
}
