package student_valeriia_kulikova.Lesson_2.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("write NUMBER");
        int Num1 = scanner.nextInt();

        for(int i = 1; i < 11; i++) {

            int Mult=Num1 * i;
            System.out.println(Num1 + " x " + i + " = " + Mult);
        }

    }
         

}
