package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

public class Task_15 {
/*    Создание иерархии класса Shape (геометрическая фигура).

    Дан класс Shape:*/

    static abstract class Shape {

        static protected String title;

        Shape(String title) {
            this.title = title;
        }

        abstract double calculateArea();
        abstract double calculatePerimeter();

    }

    /*Объявите в классе Shape абстрактный метод
    для подсчёта периметра.*/
}
