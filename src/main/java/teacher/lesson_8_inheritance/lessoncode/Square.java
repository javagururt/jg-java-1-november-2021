package teacher.lesson_8_inheritance.lessoncode;

class Square extends Shape {

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
