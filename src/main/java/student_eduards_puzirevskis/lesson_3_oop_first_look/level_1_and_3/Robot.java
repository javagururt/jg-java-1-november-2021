package student_eduards_puzirevskis.lesson_3_oop_first_look.level_1_and_3;
/*
Создайте класс робот (Robot).

Научите вашего робота "говорить" привет.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
    }

 */
class Robot {
   String  name;
    public void sayHello() {
        System.out.println("Hello!");
            }
    public Robot(String robotName) {
        this.name = robotName;

    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
