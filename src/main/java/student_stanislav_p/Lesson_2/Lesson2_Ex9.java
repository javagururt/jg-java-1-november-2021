package student_stanislav_p.Lesson_2;

import java.util.Scanner;

public class Lesson2_Ex9 {

        public static void main(String [] args) {


            Scanner scanner = new Scanner(System.in);


            System.out.println("Введите число ->");

            int Num1 = scanner.nextInt();


            for(int i = 1; i < 11; i++) {
                int Mult=Num1 * i;
                System.out.println(Num1 + " x " + i + " = " + Mult);
            }

        }

}
