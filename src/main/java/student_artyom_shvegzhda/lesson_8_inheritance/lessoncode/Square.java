package student_artyom_shvegzhda.lesson_8_inheritance.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Shape;

class Square extends teacher.lesson_8_inheritance.lessoncode.Shape {

    private int sideA;

    public Square(String name, int sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }
}
