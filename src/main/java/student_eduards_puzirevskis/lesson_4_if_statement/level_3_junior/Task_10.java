package student_eduards_puzirevskis.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
@CodeReview(approved = true)
class Task_10 {

    public static void main(String[] args) {
        System.out.println("Hi! Let's compare three numbers and calculate, which one of them is the BIGGEST.");
        System.out.println("Please, type first number:");
        Scanner scanner = new Scanner(System.in);
        int userFirstNumber = scanner.nextInt();
        System.out.println("Please, type second number:");
        int userSecondNumber = scanner.nextInt();
        System.out.println("Please, type third number:");
        int userThirdNumber = scanner.nextInt();
        System.out.println("OK. Let me check...");
        if (userFirstNumber > userSecondNumber && userFirstNumber > userThirdNumber) {
            System.out.println("The biggest number is: " + userFirstNumber);
        } else if (userSecondNumber > userFirstNumber && userSecondNumber > userThirdNumber) {
            System.out.println("The biggest number is: " + userSecondNumber);
        } else if (userThirdNumber > userFirstNumber && userThirdNumber > userSecondNumber) {
            System.out.println("The biggest number is: " + userThirdNumber);
        } else if (userFirstNumber < userSecondNumber && userSecondNumber == userThirdNumber) {
            System.out.println("The biggest number is: " + userThirdNumber);
        } else if (userFirstNumber == userSecondNumber && userFirstNumber > userThirdNumber){
            System.out.println("The biggest number is: " + userFirstNumber);
        } else if (userFirstNumber == userThirdNumber && userFirstNumber > userSecondNumber) {
            System.out.println("The biggest number is: " + userFirstNumber);
        } else {
            System.out.println("All number are equal");
        }
    }
}
