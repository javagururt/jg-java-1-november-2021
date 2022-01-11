package student_victor_veselov.lesson_6.intern_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }
    public void isEvenTest(){
        NumberUtils numberUtils = new NumberUtils();
        boolean check = true;
        if ( check == numberUtils.isEven(2)){
            System.out.println("Test Done");
        }else {
            System.out.println("Test Failed");
        }
    }
}
