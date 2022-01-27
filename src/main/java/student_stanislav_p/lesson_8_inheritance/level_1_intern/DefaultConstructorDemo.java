package student_stanislav_p.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

/*
Что такое дефолтный конструктор
или как его еще называют конструктор по умолчанию?
Это конструктор без параметров, тело которого пустое.

Создайте класс DefaultConstructor и в нём
явно объявите дефолтный конструктор.

Создайте класс DefaultConstructorDemo и продемонстрируйте вызов
дефолтного конструктора из класса DefaultConstructor в main() методе.
 */
@CodeReview(approved = true)
public class DefaultConstructorDemo {

    public static void main(String[] args) {
        DefaultConstructor myBox1 = new DefaultConstructor();

        System.out.println("Volume of the box is - " +myBox1.getVolume());


    }
}
