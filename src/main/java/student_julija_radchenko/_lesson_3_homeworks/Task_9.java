package student_julija_radchenko._lesson_3_homeworks;

import java.util.Scanner;

public class Task_9 {
    public static void main( String[] args){
        Scanner nameInput = new Scanner( System.in);
        System.out.println("Please, enter your name");
        String yourName = nameInput.nextLine();
        System.out.println("Hello" + yourName + "!");
    }
}
