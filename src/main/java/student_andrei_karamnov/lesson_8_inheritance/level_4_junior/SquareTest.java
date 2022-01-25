package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.squareMethodsTest();
    }
    void squareMethodsTest(){
        Square test = new Square(5);
        checkTestResult(test.calculateArea(), 25, "Square calculating area TEST ");
        checkTestResult(test.calculatePerimeter(), 20, "Square calculating perimeter TEST ");
    }
    private void checkTestResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
