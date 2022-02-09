package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_5_middle;
/* Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.*/
public class ArrayUtilTest {

        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
            test.shouldFindMaxNumber();
            test.shouldFindMinNumber();
        }

        public void shouldCreateArray() {
            int testLength = 10;
            ArrayUtil arrayUtil = new ArrayUtil();
            int [] result = arrayUtil.createArray(testLength);
            if (result.length == testLength) {
                System.out.println("test 1 = OK.");
            } else {
                System.out.println("test 2 = FAIL.");
            }
        }

        public void shouldFindMaxNumber() {
            int [] testArray = {2, 12, 15, 50};
            ArrayUtil arrayUtil = new ArrayUtil();
            int maxResult = arrayUtil.findMaxNumber(testArray);
            if (maxResult == 50) {
                System.out.println("test 2 = OK.");
            } else {
                System.out.println("test 2 = FAIL.");
            }
        }
         public void shouldFindMinNumber() {
             int [] testArray = {2, 12, 15, 50};
             ArrayUtil arrayUtil = new ArrayUtil();
             int minResult = arrayUtil.findMinNumber(testArray);
             if (minResult == 2) {
                 System.out.println("test 3 = OK.");
             } else {
                 System.out.println("test 3 = FAIL.");
             }
    }
}
