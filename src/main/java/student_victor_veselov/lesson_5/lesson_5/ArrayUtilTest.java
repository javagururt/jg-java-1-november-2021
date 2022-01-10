package student_victor_veselov.lesson_5.lesson_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtils = new ArrayUtil();
        int[] numbers = arrayUtils.createArray(10);
        int actualResult = 10;
        if (actualResult == numbers.length) {
            System.out.println("Crate Array Test DOne");
        } else {
            System.out.println("Failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 4, 3, 6};
        int result = 6;
        int actualNumber = arrayUtil.findMaxNumber(array);
        if (result == actualNumber) {
            System.out.println("MaxNum Test D0ne");
        } else {
            System.out.println("Test Failed");
        }
    }
    public void shouldFindMinNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3,5,2,1,7};
        int result = 1;
        int actualNumber = arrayUtil.findMinNumber(array);
        if (result == actualNumber){
            System.out.println("Test Done ");
        }else {
            System.out.println("Test Failed");
        }
    }
}