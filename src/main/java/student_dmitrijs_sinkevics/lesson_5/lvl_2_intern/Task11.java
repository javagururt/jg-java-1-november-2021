package student_dmitrijs_sinkevics.lesson_5.lvl_2_intern;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Enter three numbers");

        for (int i=0;i< numbers.length;i++){
            numbers[i]= keyboard.nextInt();
        }

        for (int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]);
            if (i<= numbers.length-2){
                System.out.print(", ");
            }
        }
    }
}
