package student_dmitrijs_sinkevics.lesson_4.lvl_1_intern;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int inputValue=keyboard.nextInt();
        System.out.print("Inter integer");

        if (inputValue>0){
            System.out.print("Inter is positive");
        } else if (inputValue<0) {
            System.out.println("Integer is negative");
        } else {
            System.out.println("Integer is not negative and not positive");
        }
    }
}
