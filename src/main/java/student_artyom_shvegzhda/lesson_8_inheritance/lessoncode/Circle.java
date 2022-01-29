package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Shape;

class Circle extends teacher.lesson_8_inheritance.lessoncode.Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
