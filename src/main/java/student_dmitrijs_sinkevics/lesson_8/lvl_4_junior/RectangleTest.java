package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double sideA = 5;
        double sideB = 10;
        double expectedResult = 50;
        Rectangle rectangle = new Rectangle("Rectangle", sideA, sideB);
        double realResult = rectangle.calculateArea();
        if (realResult == expectedResult)
            System.out.println("calculateAreaTest test = OK");
        else
            System.out.println("calculateAreaTest test = fail");
    }

    public void calculatePerimeterTest() {
        double sideA = 5;
        double sideB = 10;
        double expectedResult = 30;
        Rectangle rectangle = new Rectangle("Square", sideA,sideB);
        double realResult = rectangle.calculatePerimeter();
        if (realResult == expectedResult)
            System.out.println("calculatePerimeterTest test = OK");
        else
            System.out.println("calculatePerimeterTest test = fail");
    }
}
