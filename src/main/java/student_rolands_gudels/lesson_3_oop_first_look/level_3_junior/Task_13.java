package student_rolands_gudels.lesson_3_oop_first_look.level_3_junior;

 class Task_13 {
    /*Дайте роботу имя! Продолжение.

Тема: использование свойства класса.


Воспользуйтесь свойством класса в методе sayYourName():

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        String name;

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

        void sayYourName() {
            System.out.println("My name is " + this.name);
        }

    }

Запустите программу RobotDemo и убедитесь,
что каждый робот теперь запомнил своё имя!*/

    // Done
}
