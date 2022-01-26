package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.circleMethodsTest();

    }

    void circleMethodsTest(){
        Circle test = new Circle(5.0);
        checkTestResult(test.calculateArea(), 78.5, "Circle calculating area TEST ");
        checkTestResult(test.calculatePerimeter(), 31.401, "Circle calculating perimeter TEST ");
    }

    private void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
