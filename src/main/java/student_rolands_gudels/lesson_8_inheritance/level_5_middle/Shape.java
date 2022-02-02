package student_rolands_gudels.lesson_8_inheritance.level_5_middle;

public abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
