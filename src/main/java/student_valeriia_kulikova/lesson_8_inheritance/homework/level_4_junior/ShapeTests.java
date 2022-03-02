package student_valeriia_kulikova.lesson_8_inheritance.homework.level_4_junior;

public class ShapeTests {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 2);
        double expectedResultCircleArea = 4 * Math.PI;
        double expectedResultCirclePerimetr = 4 * Math.PI;
        boolean testArea = (expectedResultCircleArea == circle.calculateArea());
        if (testArea) {
            System.out.println("Circle.Test 1 is OK");
        } else {
            System.out.println("Circle.Test 1 is FALSE");
        }
        boolean testPerimetr = (expectedResultCirclePerimetr == circle.calculatePerimetr());
        if (testPerimetr) {
            System.out.println("Circle.Test 2 is OK");
        } else {
            System.out.println("Circle.Test 2 is FALSE");
        }
        Square square = new Square("Square", 10);
        double expectedResultSquareArea = 100;
        double expectedResultSquarePerimetr = 40;
        boolean testSquareArea = (expectedResultSquareArea == square.calculateArea());
        if (testSquareArea) {
        System.out.println("Square.Test 1 is OK ");
        } else {
            System.out.println("Square.Test 1 is FALSE");
        }
        boolean testSquarePerimetr = (expectedResultSquarePerimetr == square.calculatePerimetr());
        if (testSquarePerimetr) {
            System.out.println("Square.Test 2 is OK");
        } else {
            System.out.println("Square.Test 2 is FALSE");
        }
        Rectangle rectangle = new Rectangle("Rectangle",  5, 10);
        double expectedResultRectangleArea = 50;
        double expectedResultRectanglePerimetr = 30;
        boolean testRectangleArea = (expectedResultRectangleArea == rectangle.calculateArea());
        if (testRectangleArea) {
            System.out.println("Rectangle.Test 1 is OK ");
        } else {
            System.out.println("Rectangle.Test 1 is FALSE");
        }
        boolean testRectanglePerimetr = (expectedResultRectanglePerimetr == rectangle.calculatePerimetr());
        if (testRectanglePerimetr) {
            System.out.println("Rectangle.Test 2 is OK");
        } else {
            System.out.println("Rectangle.Test 2 is FALSE");
        }

        Triangle triangle = new Triangle("Triangle", 5);
        double expectedResultTriangleArea = 25*Math.sqrt(3)/4;
        double expectedResultTrianglePerimetr = 15;
        boolean testTriangleArea = (expectedResultTriangleArea == triangle.calculateArea());
        if (testTriangleArea) {
            System.out.println("Triangle.Test 1 is OK ");
        } else {
            System.out.println("Triangle.Test 1 is FALSE");
        }
        boolean testTrianglePerimetr = (expectedResultTrianglePerimetr == triangle.calculatePerimetr());
        if (testTrianglePerimetr) {
            System.out.println("Triangle.Test 2 is OK");
        } else {
            System.out.println("Triangle.Test 2 is FALSE");
        }
    }
}
