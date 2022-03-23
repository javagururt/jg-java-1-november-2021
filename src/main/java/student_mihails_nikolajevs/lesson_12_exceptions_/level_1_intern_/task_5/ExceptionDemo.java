package student_mihails_nikolajevs.lesson_12_exceptions_.level_1_intern_.task_5;
/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.
 */

import java.util.Scanner;

public class ExceptionDemo extends Exception {

    public static void main(String[] args) {
        ExceptionDemo mc = new ExceptionDemo();
        String str = mc.getMessage();
        System.out.println("str = " + str);
    }

    class TriangleException extends Exception {
        public String toString(){
           return "Error. Bad sides of Triangle." ;
        }
    }
    // обьявить класс треугольник
    class Triangle{

        // стороны треугольника
        private double a,b,c;

        // конструктор по умолчанию
        public Triangle(){
        }
    // равносторонний треугольник с длиной стороны 1
    // public double  a = b = c = 1;
    }

}
