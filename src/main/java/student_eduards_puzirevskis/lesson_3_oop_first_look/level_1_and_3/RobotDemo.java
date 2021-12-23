package student_eduards_puzirevskis.lesson_3_oop_first_look.level_1_and_3;

import teacher.annotations.CodeReview;

/*
Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

Внутри класса RobotDemo создайте метод

    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    }
 */
@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {

        Robot Chappie = new Robot("Chappie");
        Chappie.sayHello();
        Chappie.sayYourName();

        Robot Optimus = new Robot("Optimus");
        Optimus.sayHello();
        Optimus.sayYourName();

        Robot Alita = new Robot("Alita");
        Alita.sayHello();
        Alita.sayYourName();

    }

}
