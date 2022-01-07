package teacher.lesson_6_arrays_while_loop.lessoncode;

class ArrayUtilsTest {

    public static void main(String[] args) {
        shouldFindMinInArray();
    }


    static void shouldFindMinInArray() {
        ArrayUtils victim = new ArrayUtils();
        int[] numbers = {1, 3, -1, 20, 30};

        int expectedResult = -1;
        int actualResult = victim.findMin(numbers);

        if (expectedResult == actualResult) {
            System.out.println("shouldFindMinInArray: SUCCESS");
        } else {
            System.out.println("shouldFindMinInArray: FAILURE, expected: " + expectedResult + " but was " + actualResult);
        }
    }
}
