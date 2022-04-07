package student_andrei_karamnov.lesson_12_exceptions.homework.level_3_junior;

import java.io.IOException;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    /*Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.*/

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean right = false;

        while (!right) {
            System.out.println("Please enter an integer 'a' ");
            try {
                int a = scanner.nextInt();
                System.out.println("Your integer is " + a);
                System.out.println("Thank you!");
                right = true;
            } catch (Exception e) {
                System.out.println("Oops, wrong input type, try again");
                scanner.next();
            }
        }
    }

}
