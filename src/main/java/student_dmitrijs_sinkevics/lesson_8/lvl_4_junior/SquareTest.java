package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        double side = 5;
        double expectedResult = 25;
        Square square = new Square("Square", side);
        double realResult = square.calculateArea();
        if (realResult == expectedResult)
            System.out.println("calculateAreaTest test = OK");
        else
            System.out.println("calculateAreaTest test = fail");
    }

    public void calculatePerimeterTest() {
        double side = 5;
        double expectedResult = 20;
        Square square = new Square("Square", side);
        double realResult = square.calculatePerimeter();
        if (realResult == expectedResult)
            System.out.println("calculatePerimeterTest test = OK");
        else
            System.out.println("calculatePerimeterTest test = fail");
    }
}
