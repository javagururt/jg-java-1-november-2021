package student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern;


public class RobotDemo {
        public static void main(String[] args) {
            student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot robotDemo = new student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot("JOhn");
            robotDemo.sayHello();
            robotDemo.sayYourName();
            System.out.println();

            student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot robot1 = new student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot("Rider");
            robot1.sayHello();
            robot1.sayYourName();
            System.out.println();

            student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot robot2 = new student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot("Tom");
            robot2.sayHello();
            robot2.sayYourName();
        }

}