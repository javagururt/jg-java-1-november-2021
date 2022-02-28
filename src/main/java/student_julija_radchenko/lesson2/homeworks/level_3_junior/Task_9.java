package student_julija_radchenko.lesson2.homeworks.level_3_junior;

import java.util.Scanner;

public class Task_9 {
    public static void main (String[] args){

        System.out.println("Please insert whole number");

        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();

        for ( int i =0; i<10; i++){
            System.out.println(number + " x "+ (i+1)+"=" + (number * (i+1)));
        }
    }
}
