package student_mihails_nikolajevs.lesson_3.level_1_intern_;

import teacher.annotations.CodeReview;

/*

Создайте класс робот (Robot).

Научите вашего робота "говорить" привет.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
    }



 */
/*

Научите вашего робота "говорить" как его зовут.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayYourName() {
        // тут напишите команду распечатки на консоли строки "My name is ROBO"
    }


 */

@CodeReview(approved = true)
public class Robot {

    String sayHello;
    String sayYourName;

    public Robot() {
    }


    public void sayHello() {
        System.out.println("Hello");

    }

    public void sayYourName() {

        System.out.println("My name is Robo");
    }
}