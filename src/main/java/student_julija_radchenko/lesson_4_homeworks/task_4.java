package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class task_4 {
    public static void main(String[] args) {
        Scanner newNumber = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int inputNumber = newNumber.nextInt();

        if( inputNumber % 2 ==0){
            System.out.println("Even number");
        } else {
            System.out.println("The number is not even");
        }
    }

}
