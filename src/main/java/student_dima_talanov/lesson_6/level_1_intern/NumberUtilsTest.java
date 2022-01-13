package student_dima_talanov.lesson_6.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        int number = 50;
        boolean exceptedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == exceptedResult) {
            System.out.println("Answer parity test: = OK!");
        } else {
            System.out.println("Answer parity test: = FAIL!");
        }
    }
}
