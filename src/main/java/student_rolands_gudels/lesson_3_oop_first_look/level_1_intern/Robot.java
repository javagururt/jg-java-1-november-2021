package student_rolands_gudels.lesson_3_oop_first_look.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {

            //Создайте класс робот (Robot).
        //
        // Научите вашего робота "говорить" привет.
        //
        // Создайте в классе Robot метод со следующей сигнатурой:
        //
        //     public void sayHello() {
        //         // тут напишите команду распечатки на консоли строки "Hello!"
        //

         void sayHello() {
              System.out.println("Hello!");
        }
    String name;
    Robot(String robotName) {
        this.name = robotName;}

        void sayYourName() {
            System.out.println("My name is " + this.name);
        }

    /*public void sayYourName() {
        System.out.println("My name is ROBO");
    }*/






    }






