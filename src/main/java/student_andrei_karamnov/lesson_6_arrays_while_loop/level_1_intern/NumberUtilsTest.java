package student_andrei_karamnov.lesson_6_arrays_while_loop.level_1_intern;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void isEvenTest(){
        NumberUtils numberUtils = new NumberUtils();
        boolean result = true;
        checkResults(result == numberUtils.isEven(10) , "isEven Test");
    }

}
