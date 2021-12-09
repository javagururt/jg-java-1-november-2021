package student_julija_radchenko.lesson2.homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "second input не используется")
public class Lesson2Task1 {

    public static void main(String[] args) {
  System.out.println("Please enter first whole number");

        Scanner input = new Scanner( System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter second whole number");
        Scanner secondInput = new Scanner( System.in);
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum result:" + sumResult);

        int subtractResult = firstNumber - secondNumber;
        System.out.println("Subtract result:" + subtractResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multilpy result:" + multiplyResult);

        int divideResult = firstNumber / secondNumber;
        System.out.println("divide result:" + divideResult);


    }
}
