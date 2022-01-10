package student_rolands_gudels.lesson_6_arrays_while_loop.level_3_junior;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.arrayServiceTest1();
        arrayServiceTest.arrayServiceTest2();
        arrayServiceTest.arrayServiceTest3();
        arrayServiceTest.arrayServiceTest4();

    }
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    void arrayServiceTest1() {
        ArrayService arrayService = new ArrayService();
        boolean expected = true;
        boolean actual = arrayService.findNeededArrayNumber(numbers, 3);
        if (expected ==actual) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed" + " actual was " + actual + " expected " + expected);
        }
    }
    void arrayServiceTest2() {
        ArrayService arrayService = new ArrayService();
        boolean expected = false;
        boolean actual = arrayService.findNeededArrayNumber(numbers, 14);
        if (expected ==actual) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed" + " actual was " + actual + " expected " + expected);
        }
    }
    void arrayServiceTest3() {
        ArrayService arrayService = new ArrayService();
        boolean expected = false;
        boolean actual = arrayService.findNeededArrayNumber(numbers, 0);
        if (expected ==actual) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed" + " actual was " + actual + " expected " + expected);
        }
    }
    void arrayServiceTest4() {
        ArrayService arrayService = new ArrayService();
        boolean expected = false;
        boolean actual = arrayService.findNeededArrayNumber(numbers, -1);
        if (expected ==actual) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed" + " actual was " + actual + " expected " + expected);
        }
    }
}
