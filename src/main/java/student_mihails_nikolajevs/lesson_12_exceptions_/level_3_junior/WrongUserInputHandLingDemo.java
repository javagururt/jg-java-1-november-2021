package student_mihails_nikolajevs.lesson_12_exceptions_.level_3_junior;

import java.io.IOException;
import java.util.Scanner;

/*
Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */
public class WrongUserInputHandLingDemo {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        boolean right = false;

        while (!right) {
            System.out.println("Please Enter Whole Number : ");
            try {
                int number = in.nextInt();

                System.out.println(" Your Number : " + number);
                System.out.println("OK");
                right = true;
            } catch (Exception e) {

                System.out.println("Its Not Integer !!! Incorrect Input !!!");
                in.next();

            }
        }
    }
}