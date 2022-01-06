package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class task_3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter number from 1 to 7");
        int inputNumber = input.nextInt();

        switch (inputNumber){
            case 1 :{
                System.out.println("Monday");
                break;}
            case 2 : {
                System.out.println("Tuesday");
                break;}
            case 3 : {
                System.out.println("Wednesday");
                break;}
            case 4 : {
                System.out.println("Thursday");
                break;}
            case 5 : {
                System.out.println("Friday");
                break;}
            case 6 : {
                System.out.println("Saturday");
                break;}
            case 7 : {
                System.out.println("Sunday");
                break;}
            default:{
                System.out.println("Incorrectly entered day of the week");
                break;
            }
        }


    }
}
