package student_mihails_nikolajevs.lesson_3.level_1_intern_;
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
/*
В методе main(...) класса RobotDemo вызовите
метод sayHello() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли слово "Hello!".

 */

import teacher.annotations.CodeReview;

/*

В методе main(...) класса RobotDemo вызовите
        метод sayYourName() у созданного ранее виртуального обьекта.
        Запустите вашу программу и убедитесь, что созданный вами
        виртуальный обьект робот напечатал на консоли "My name is ROBO".


 */
/*

Создаём свою армию роботов!

В этом задании мы продолжаем работать с классом Robot.

В методе main(...) класса RobotDemo продемонстрируйте создание
нескольких виртуальный обьектов робот и работу с ними
(вызовы у них методов sayHello() и sayYourName()).

PS: ваш код внутри main метода будет выглядеть примерно так:

Robot robot1 = new Robot();
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot();
robot2.sayHello();
robot2.sayYourName();

Класс (Robot) это как чертёж или шаблон, на основе которого
в вашей программе можно создавать сколько угодно виртуальных
обьектов и управлять ими (вызывать у них разные методы).
 */
@CodeReview(approved = true)
public class RobotDemo {

    

    public static void main(String[] args) {

        Robot myRobot = new Robot();
        myRobot.sayHello = "Hello";
        myRobot.sayYourName = "My Name is Robo";

        System.out.println( myRobot.sayHello );
        System.out.println( myRobot.sayYourName );

        Robot Robot1 = new Robot();
        Robot1.sayHello = "Good Morning";
        Robot1.sayYourName = "My name is Robo1";

        System.out.println(Robot1.sayHello);
        System.out.println(Robot1.sayYourName);

        Robot Robot2 = new Robot();
        Robot2.sayHello = "Hi";
        Robot2.sayYourName = "My name is Robo2";

        System.out.println(Robot2.sayHello);
        System.out.println(Robot2.sayYourName);


    }

}
