package student_stanislav_p.lesson_12_exceptions.homework.level_3_junior;

import java.io.IOException;
import java.util.Scanner;

import teacher.annotations.CodeReview;


// ---- Task_19 ----

@CodeReview(approved = true)
public class WrongUserInputHandlingDemo {

        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            boolean bool = false;
            int x=0;

            while (!bool) {
                System.out.println("Enter an integer ->");

                try {
                    x=0;
                    x = sc.nextInt();
                    System.out.println("Your entered integer - "+x);
                    System.out.println("Ok ");
                    bool=true;
                } catch (Exception e) {
                    sc.next();
                    System.out.println("Error entering an integer. Retype!");
                    //e.printStackTrace();
                }


            }
        }


}
