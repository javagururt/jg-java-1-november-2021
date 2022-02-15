package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double radius = 5;
        double expectedResult = 78.5;
        Circle circle = new Circle("Circle", radius);
        double realResult = circle.calculateArea();
        if (realResult == expectedResult)
            System.out.println("calculateAreaTest test = OK");
        else
            System.out.println("calculateAreaTest test = fail");
    }

    public void calculatePerimeterTest() {
        double radius = 5;
        double expectedResult = 31.400000000000002;
        Circle circle = new Circle("Circle", radius);
        double realResult = circle.calculatePerimeter();
        if (realResult == expectedResult)
            System.out.println("calculatePerimeterTest test = OK");
        else
            System.out.println("calculatePerimeterTest test = fail");
    }
}
