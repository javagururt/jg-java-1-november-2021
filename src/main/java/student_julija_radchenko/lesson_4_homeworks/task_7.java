package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

public class task_7 {
    public static void main (String [] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = number.nextInt();
        System.out.println("Please enter second number ");
        int secondNumber = number.nextInt();
        if(firstNumber == secondNumber ) {
            System.out.println("Numbers are equals");
        }else{
            System.out.println("Numbers are different");
        }
    }
}
