package student_mihails_nikolajevs;
/*
Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.

1. Создать класс с нужным именем;
2. Создать описать main метод;
3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
          Scanner scanner = new Scanner(System.in);
          int firstNumber = scanner.nextInt();
4. Запишите полученные результаты в переменные;
5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
 (каждый результат на новой строке отдельно).
*/




 import java.util.Scanner;

  public class HomeWorkVariablesTask1 {

      public static void main(String[] args) {
          int SUM;
          int MIN;
          int DIV;
          int MULT;




          Scanner num = new Scanner(System.in);
          System.out.println("Please Enter First Number:");
          int a = num.nextInt();


          System.out.println("Please Enter Second Number:");
          int b = num.nextInt();

           SUM = a + b;
           MIN = a - b;
           DIV = a / b;
           MULT = a * b;

          System.out.println("SUM: " + a + " + " + b );
          System.out.println("SUM= "  + SUM );
          System.out.println("MIN: " + a + " - " + b );
          System.out.println("MIN= "  + MIN);
          System.out.println("DIV: " + a + " / " + b );
          System.out.println("DIV= "  + DIV);
          System.out.println("MULT: "  + a + " * " + b );
          System.out.println("MULT: " + MULT);



      }
  }








