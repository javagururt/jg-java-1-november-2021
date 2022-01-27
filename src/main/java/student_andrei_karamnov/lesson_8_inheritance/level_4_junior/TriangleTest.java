package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.triangleMethodsTest();
    }
    void triangleMethodsTest(){
        Triangle test = new Triangle(5,7);
        checkTestResult(test.calculateArea(), 17.5, "Triangle calculating area TEST ");
        checkTestResult(test.calculatePerimeter(), 15, "Triangle calculating perimeter TEST ");
    }
    private void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
