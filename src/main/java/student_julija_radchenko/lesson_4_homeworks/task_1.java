package student_julija_radchenko.lesson_4_homeworks;

import java.util.Scanner;

public class task_1 {
    public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Please, enter a value");

int inputNumber = input.nextInt();
if (inputNumber > 0){
    System.out.println("value is positive");
}
if (inputNumber < 0){
    System.out.println("value ir negative");
}
    }

}
