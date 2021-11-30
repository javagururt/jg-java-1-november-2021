package student_valeriia_kulikova;

import java.util.Scanner;

public class Lesson2_Ex9 {
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
