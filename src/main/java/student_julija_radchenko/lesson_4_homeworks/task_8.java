package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class task_8 {
    public static void main(String [] args){
        Scanner number = new Scanner(System.in);
     System.out.println("Enter first number");
     int firstNumber = number.nextInt();

     System.out.println("Enter second number");
     int secondNumber = number.nextInt();

     System.out.println("Enter third number");
     int thirdNumber = number.nextInt();
     if ((firstNumber == secondNumber) && (firstNumber == thirdNumber )) {
         System.out.println("All numbers are equal");
     }else if((firstNumber!= secondNumber) && (secondNumber != thirdNumber)) {
         System.out.println("All numbers are different");
     }else{
         System.out.println("Neither all are equal or different");
     }

    }
}
