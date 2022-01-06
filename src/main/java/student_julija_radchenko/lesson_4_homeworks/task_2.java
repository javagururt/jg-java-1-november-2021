package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class task_2 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a value");
        int inputNumber = input.nextInt();

        if (inputNumber > 0){
            System.out.println("value ir positive");
        } else if(inputNumber < 0 ){
            System.out.println("value is negative");
        } else {
                System.out.println("value is equal to zero");
            }
    }
}