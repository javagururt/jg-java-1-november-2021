package student_andrei_karamnov.lesson_2_variables.level_7_senior;

import java.util.Scanner;

/*Напишите программу и продемонстрируйте в ней использование
однострочного и многострочного коментариев.
*/
public class Task_32 {
    public static void main(String[] args) {
        System.out.println("Hello Mr. %n"); //Приветствие.
        System.out.println("Please enter two integer or fractional numbers"); //Запрос.
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();//Ввод переменной 1
        double b = input.nextDouble();//Ввод переменной 2
        System.out.println("Your result:");//Результат.
        double sumResult = a + b;//Сумма
        double subResult = a - b;//Разность
        double divideResult = a / b;//Частное
        double multiplyResult = a * b;//Произведение
//Далее вывод результатов операций.
        System.out.println("Multiply:" + multiplyResult);
        System.out.println("Divide:" + divideResult);
        System.out.println("Sum:" + sumResult);
        System.out.println("Sub:" + subResult);
    }}
