package student_dmitrijs_sinkevics.lesson_6.lvl_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest();
        test.isOddTest();
    }

    public void isEvenTest() {
        int number = 100;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult)
            System.out.println("isEven test = OK");
        else
            System.out.println("isEven test = fail");
    }

    public void isOddTest() {
        int number = 101;
        boolean expectedResult = false;
        NumberUtils numberUtils=new NumberUtils();
        boolean realResult=numberUtils.isEven(number);
        if (realResult==expectedResult)
            System.out.println("isOdd test = OK");
        else
            System.out.println("isOdd test = fail");
    }
}
