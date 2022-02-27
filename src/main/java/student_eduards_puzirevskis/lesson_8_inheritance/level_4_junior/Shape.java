package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
