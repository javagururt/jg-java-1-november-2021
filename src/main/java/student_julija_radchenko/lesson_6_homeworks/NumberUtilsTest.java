package student_julija_radchenko.lesson_6_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest newTest = new NumberUtilsTest();
        newTest.evenNumberTest();
        newTest.oddNumberTest();
    }

    public void evenNumberTest() {
        NumberUtils value = new NumberUtils();
        int number = 2;
        if (value.isEven(number)) {
            System.out.println("Even number test - OK");
        } else {
            System.out.println("Even number test - FAIL");
        }

    }

    public void oddNumberTest() {
        NumberUtils value = new NumberUtils();
        int number = 3;
        if (value.isEven(number)) {
            System.out.println("Odd number test - FAIL");
        } else {
            System.out.println("Odd number test - OK");

        }
    }
}
