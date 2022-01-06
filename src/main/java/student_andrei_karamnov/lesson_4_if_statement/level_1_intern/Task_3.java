package student_andrei_karamnov.lesson_4_if_statement.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_3 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Monday");
            }
            else if (x == 2) {
                System.out.println("Tuesday");
            }
            else if (x == 3) {
                System.out.println("Wednesday");
            }
            else if (x == 4) {
            System.out.println("Thursday");
            }
            else if (x == 5) {
            System.out.println("Friday");
            }
            else if (x == 6) {
                System.out.println("Saturday");
            }
            else if (x == 7) {
            System.out.println("Sunday");
        }
            else if (x < 1 || x > 7) {
            System.out.println("Please enter an integer from 1 to 7");
        }

    }}