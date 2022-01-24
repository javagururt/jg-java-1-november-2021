package student_stanislav_p.lesson_8_inheritance.homework.level_1_intern;
/*
Нужно ли в классе создавать дефолтный конструктор
(конструктор по умолчанию)
или Java его автоматически добавит при компиляции кода?

Ответьте на вопрос примером кода!

Для этого создайте классы DefaultConstructorV2
и DefaultConstructorV2Demo в которых и напишите
код являющийся ответом на поставленный вопрос.

 */

public class DefaultConstructorV2Demo {

    public static void main(String[] args) {
        DefaultConstructorV2 myBox2 = new DefaultConstructorV2();

        System.out.println("Volume of the box is - " +myBox2.getVolume());


    }
}
