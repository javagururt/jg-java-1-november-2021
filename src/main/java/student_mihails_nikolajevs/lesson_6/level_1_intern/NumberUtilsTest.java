package student_mihails_nikolajevs.lesson_6.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {

        NumberUtils numberUtils = new NumberUtils();
        boolean check = true;

        if (check == numberUtils.isEven(2)) {
            System.out.println(" TEST SUCCESS ");

        } else {
            System.out.println(" TEST FAILED ");
        }
    }
}
