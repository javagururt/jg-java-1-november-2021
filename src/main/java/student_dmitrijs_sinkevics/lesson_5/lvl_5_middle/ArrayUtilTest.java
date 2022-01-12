package student_dmitrijs_sinkevics.lesson_5.lvl_5_middle;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int arraySize=10;
        int expectedResult =10;

        ArrayUtil array = new ArrayUtil();
        int[] actualResult =array.createArray(arraySize);
        if(actualResult.length==expectedResult){
            System.out.println("Array test ok");
        } else
            System.out.println("Array test fail");
    }
}
