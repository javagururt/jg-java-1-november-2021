package student_dmitrijs_sinkevics.lesson_3.lvl_1_intern;

import teacher.annotations.CodeReview;

/*
Создайте класс робот (Robot).

        Научите вашего робота "говорить" привет.

        Создайте в классе Robot метод со следующей сигнатурой:

 */
@CodeReview(approved = true)
public class Robot {
    String name;
    Robot(String robotName) {
        this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
    }

    public Robot() {


    }
    public void sayHello() {

        System.out.println("Hello!");

    }
    public void sayYourName() {
        System.out.println("My name is "+this.name);
    }

}

