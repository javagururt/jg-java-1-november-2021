package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Shape;

class ShapeUtils {

    public double sumAreas(teacher.lesson_8_inheritance.lessoncode.Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            teacher.lesson_8_inheritance.lessoncode.Shape shape = shapes[i];
            sum = shape.calculateArea() + sum;
        }
        return sum;
    }
}
