package student_mihails_nikolajevs.lesson_12_exceptions_.level_1_intern_.task_5;

import teacher.annotations.CodeReview;

/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.
 */
@CodeReview(approved = true)
public class ExceptionDemo extends Exception {

    public ExceptionDemo() {
    }

    public ExceptionDemo(String message) {
        super(message);
    }

    public ExceptionDemo(String message, Throwable cause) {
        super(message);
    }

    public static void main(String[] args) {

        ExceptionDemo mc1 = new ExceptionDemo();
        String str = mc1.getMessage();
        ExceptionDemo mc2 = new ExceptionDemo("Checked Exception!");
        ExceptionDemo mc3 = new ExceptionDemo("Checked Exception!", null);
        System.out.println("str = " + str);
    }
}
  //  class TriangleException extends Exception {
    //    public TriangleException(String message) {
  //          super(message);
     //   }

    //    public String toString(){
    //       return "Error. Bad sides of Triangle." ;
    //    }
   // }
    // обьявить класс треугольник
  //  class Triangle{

        // стороны треугольника
      //  private double a,b,c;

        // конструктор по умолчанию
   //     public Triangle(){

    // равносторонний треугольник с длиной стороны 1
    // public double  a = b = c = 1;
 //   }

//}
