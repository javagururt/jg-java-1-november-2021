package teacher.lesson_8_inheritance.lessoncode;

class ShapeUtilsDemo {

    public static void main(String[] args) {
        ShapeUtils utils = new ShapeUtils();

        Circle[] circles = {
                new Circle("A", 2),
                new Circle("B", 5),
                new Circle("C", 10),
        };

        Square[] squares = {
                new Square("A", 10),
                new Square("B", 20),
                new Square("C", 30),
        };

        double circleAreas = utils.sumAreas(circles);
        double squareAreas = utils.sumAreas(squares);

        System.out.println("Circle areas = " + circleAreas);
        System.out.println("Square areas = " + squareAreas);

        Shape[] shapes = {
                new Circle("D", 30),
                new Square("E", 40)
        };

        double shapeAreas = utils.sumAreas(shapes);

        System.out.println("Shape areas = " + shapeAreas);
    }
}
