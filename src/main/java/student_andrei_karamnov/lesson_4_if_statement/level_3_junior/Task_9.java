package student_andrei_karamnov.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        System.out.println("Please enter three integers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x < y && x < z && y < z ){
            System.out.println("increasing");
        }
        else if (x > y && x > z && y > z){
            System.out.println("decreasing");
        }
        else if (x > y || x > z || y < z){
            System.out.println("Neither increasing or decreasing order");
        }
        else  if (x > y || x < z || y > z){
            System.out.println("Neither increasing or decreasing order");
        }
        else if (x < y || x > z || y > z){
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
