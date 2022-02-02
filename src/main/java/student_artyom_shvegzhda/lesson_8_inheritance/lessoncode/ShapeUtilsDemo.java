package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Circle;
import teacher.lesson_8_inheritance.lessoncode.Shape;
import teacher.lesson_8_inheritance.lessoncode.ShapeUtils;
import teacher.lesson_8_inheritance.lessoncode.Square;

class ShapeUtilsDemo {

    public static void main(String[] args) {
        teacher.lesson_8_inheritance.lessoncode.ShapeUtils utils = new teacher.lesson_8_inheritance.lessoncode.ShapeUtils();

        teacher.lesson_8_inheritance.lessoncode.Circle[] circles = {
                new teacher.lesson_8_inheritance.lessoncode.Circle("A", 2),
                new teacher.lesson_8_inheritance.lessoncode.Circle("B", 5),
                new teacher.lesson_8_inheritance.lessoncode.Circle("C", 10),
        };

        teacher.lesson_8_inheritance.lessoncode.Square[] squares = {
                new teacher.lesson_8_inheritance.lessoncode.Square("A", 10),
                new teacher.lesson_8_inheritance.lessoncode.Square("B", 20),
                new teacher.lesson_8_inheritance.lessoncode.Square("C", 30),
        };

        double circleAreas = utils.sumAreas(circles);
        double squareAreas = utils.sumAreas(squares);

        System.out.println("Circle areas = " + circleAreas);
        System.out.println("Square areas = " + squareAreas);

        teacher.lesson_8_inheritance.lessoncode.Shape[] shapes = {
                new teacher.lesson_8_inheritance.lessoncode.Circle("D", 30),
                new teacher.lesson_8_inheritance.lessoncode.Square("E", 40)
        };

        double shapeAreas = utils.sumAreas(shapes);

        System.out.println("Shape areas = " + shapeAreas);
    }
}
