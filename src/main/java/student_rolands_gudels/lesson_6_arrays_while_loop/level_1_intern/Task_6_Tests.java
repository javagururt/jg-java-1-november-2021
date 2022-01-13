package student_rolands_gudels.lesson_6_arrays_while_loop.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_6_Tests {
    public static void main(String[] args) {
        Task_6_Tests tests = new Task_6_Tests();
        tests.isEvenTest();
        tests.isNotEvenTest();
    }

    void isEvenTest() {
        Task_6.NumberUtils numberUtils = new Task_6.NumberUtils();
        // String expected = "true";
        boolean actual = numberUtils.isEven(4);
        if (actual==true) {
            System.out.println("Is Even Test Passed");
        } else {
            System.out.println("Is Even Test Failed");
        }
    }

    void isNotEvenTest(){
        Task_6.NumberUtils numberUtils = new Task_6.NumberUtils();
        // String expected = "true";
        boolean actual = numberUtils.isEven(3);
        if (actual!=true) {
            System.out.println("Is not Even Test Passed");
        } else {
            System.out.println("Is not Even Test Failed");
        }
    }
}
