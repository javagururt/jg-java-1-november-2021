package student_andrei_karamnov.lesson_12_exceptions.homework.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a numerator");
            int a = scanner.nextInt();
            System.out.println("Enter a denominator");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("Integer c is: " + c);
            System.out.println("Correct!");
        } catch (ArithmeticException ae) {          //чтоб поймать эту ошибку можно например разделить на 0
            System.out.println("Arithmetic exception " + ae);
        } catch (Exception e) {           //чтоб поймать эту ошибку можно попробовать ввести буквы или символы вместо цифр
            System.out.println("Exception " + e);
        }
    }
}
 /*Последовательность блоков catch должна идти от частного к более общему. В противном случае будет ошибка компиляции.*/