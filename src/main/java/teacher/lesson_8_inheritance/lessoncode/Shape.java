package teacher.lesson_8_inheritance.lessoncode;

abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
}
