package student_julija_radchenko.lesson2.homeworks.level_3_junior;

import java.util.Scanner;

public class Task_11 {
    public static void main( String []args){

        System.out.println("Please, insert first number : ");
        Scanner firstInput = new Scanner(System.in);
        double firstNumber = firstInput.nextDouble();

        System.out.println("Please, insert second number : ");
        Scanner secondInput = new Scanner(System.in);
        double secondNumber = secondInput.nextDouble();

        System.out.println("Please, insert third number : ");
        Scanner thirdInput = new Scanner(System.in);
        double thirdNumber = thirdInput.nextDouble();


        double averageResult = (firstNumber + secondNumber + thirdNumber) /3;
        System.out.println("Average of this numbers equals " + averageResult);
    }
}
