package student_andrei_karamnov.lesson_2_variables.level_3_junior;

/*Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.*/
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double arithmeticalMean = (a + b + c) / 3;
        System.out.println("Arithmetical mean: " + arithmeticalMean);




    }}
