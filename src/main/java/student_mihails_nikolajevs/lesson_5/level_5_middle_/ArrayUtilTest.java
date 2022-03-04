package student_mihails_nikolajevs.lesson_5.level_5_middle_;
/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
        // Проверьте, что метод создаёт массив указанной длины
    }

}
 */

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();

    }
    public void shouldCreateArray() {
        int arrayLength = 20;
        int expectedResult = 20;

        ArrayUtil array = new ArrayUtil();
        int[] actualResult = array.createArray(arrayLength);

        if(actualResult.length == expectedResult) {
            System.out.println(" ARRAY TEST SUCCESS ");
        } else
            System.out.println(" ARRAY TEST FAILED ");
        }
    }

