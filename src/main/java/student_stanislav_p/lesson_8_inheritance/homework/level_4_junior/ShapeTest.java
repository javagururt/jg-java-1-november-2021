package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior;

public class ShapeTest {
    public static void main(String[] args) {


        ShapeTest allTests = new ShapeTest();

        // --- Test circle ----

        int radius = 5;
        double expectedArea=78.53982;
        double expectedPerimeter=31.41593;

        Circle circle = new Circle("Circle", radius);

        double resultCircleArea = (double)Math.round(circle.calculateArea() * 100000d) / 100000d;
        double resultCirclePerimeter = (double)Math.round(circle.calculatePerimeter() * 100000d) / 100000d;

        allTests.checkTestResult(resultCircleArea==expectedArea, "Test 1. Circle. Circle area - ");
        allTests.checkTestResult(resultCirclePerimeter==expectedPerimeter, "Test 1. Cirlce. Circle perimeter - ");


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
}
