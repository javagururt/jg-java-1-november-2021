package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.rectangleMethodsTest();
    }

    void rectangleMethodsTest(){
        Rectangle test = new Rectangle(4, 7);
        checkTestResult(test.calculateArea(), 28, "Rectangle calculating area TEST ");
        checkTestResult(test.calculatePerimeter(), 22, "Rectangle calculating perimeter TEST ");
    }

    private void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
