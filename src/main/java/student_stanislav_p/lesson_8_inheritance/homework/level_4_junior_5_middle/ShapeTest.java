package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;

public class ShapeTest {
    public static void main(String[] args) {


        ShapeTest allTests = new ShapeTest();

        // --- Test circle ----

        allTests.testCircle(5,78.53982,31.41593 );


        // --- Test square ----

        allTests.testSquare(5,25,20);

        // --- Test rectangle ----

        allTests.testRectangle(5,10,50,30);

        // --- Test triangle ----

        allTests.testTriangle(5,10.82532,15);


    }

    //-------------- Test Circle ---------

    private void testCircle(double radius, double expectedCircleArea, double expectedCirclePerimeter ) {

        ShapeTest allTests = new ShapeTest();


        Circle circle = new Circle("Circle", radius);

        double resultCircleArea = allTests.mr(circle.calculateArea());
        double resultCirclePerimeter = allTests.mr(circle.calculatePerimeter());

        allTests.checkTestResult(resultCircleArea == expectedCircleArea, "Test 1. Circle. Circle area - ");
        allTests.checkTestResult(resultCirclePerimeter == expectedCirclePerimeter, "Test 1. Circle. Circle perimeter - ");


    }

    // --- Test square ----
    private void testSquare(double sideForSquare, double expectedSquareArea, double expectedSquarePerimeter ) {

        ShapeTest allTests = new ShapeTest();


        Square square = new Square("Square", sideForSquare);

        double resultSquareArea = allTests.mr(square.calculateArea());
        double resultSquarePerimeter = allTests.mr(square.calculatePerimeter());

        allTests.checkTestResult(resultSquareArea == expectedSquareArea, "Test 2. Square. Square area - ");
        allTests.checkTestResult(resultSquarePerimeter == expectedSquarePerimeter, "Test 2. Square. Square perimeter - ");

    }
    // --- Test rectangle ----
    private void testRectangle(double sideForRectangle1, double sideForRectangle2 , double expectedRectangleArea, double expectedRectanglePerimeter ) {

        ShapeTest allTests = new ShapeTest();


        Rectangle rectangle = new Rectangle("Rectangle", sideForRectangle1,sideForRectangle2);

        double resultRectangleArea = rectangle.calculateArea();
        double resultRectanglePerimeter = rectangle.calculatePerimeter();

        allTests.checkTestResult(resultRectangleArea == expectedRectangleArea, "Test 3. Rectangle. Rectangle area - ");
        allTests.checkTestResult(resultRectanglePerimeter == expectedRectanglePerimeter, "Test 3. Rectangle. Rectangle perimeter - ");

    }

    // --- Test triangle ----
    private void testTriangle(double sideForTriangle, double expectedTriangleArea, double expectedTrianglePerimeter ) {

        ShapeTest allTests = new ShapeTest();


        Triangle triangle = new Triangle("Square", sideForTriangle);

        double resultTriangleArea = allTests.mr(triangle.calculateArea());
        double resultTrianglePerimeter = allTests.mr(triangle.calculatePerimeter());

        allTests.checkTestResult(resultTriangleArea == expectedTriangleArea, "Test 4. Triangle. Triangle area - ");

        allTests.checkTestResult(resultTrianglePerimeter == expectedTrianglePerimeter, "Test 4. Triangle. Triangle perimeter - ");

    }


    //-------------------------------------------

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    //-------------------------------------------

    private void printTestResult(String nameResult, double result1) {

        System.out.println(nameResult+result1);

    }

    private double mr(double result) {

        return (double)Math.round(result * 100000d) / 100000d;

    }
}
