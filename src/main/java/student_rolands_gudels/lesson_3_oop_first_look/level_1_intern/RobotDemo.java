package student_rolands_gudels.lesson_3_oop_first_look.level_1_intern;

 class RobotDemo {
    public static void main(String[] args) {
    Robot robot = new Robot("Elektronik");
    robot.sayHello();
    robot.sayYourName();
        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();

    }
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
}
