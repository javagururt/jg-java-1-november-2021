package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class task_6 {
    public static void main(String []args){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter a first whole number");
        int firstNumber = inputNumber.nextInt();
        System.out.println("Please enter a second whole number");
        int secondNumber = inputNumber.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("firstNumber");
        }else{
            System.out.println("secondNumber");
        }
    }

}



