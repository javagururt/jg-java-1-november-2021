package student_julija_radchenko.lesson2.homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

public class Task8 {
    @CodeReview(approved = true)
public static void main(String[] args){
    System.out.println("What't is your name?");
    Scanner enterYourName = new Scanner(System.in);
    String YourName = enterYourName.nextLine();
    System.out.println("Hallo" + enterYourName);

}
}
