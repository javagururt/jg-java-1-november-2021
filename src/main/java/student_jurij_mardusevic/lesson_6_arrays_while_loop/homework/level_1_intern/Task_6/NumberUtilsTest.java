package student_jurij_mardusevic.lesson_6_arrays_while_loop.homework.level_1_intern.Task_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.shouldDetectIsEvenOrNot();
    }

    public void shouldDetectIsEvenOrNot() {
        NumberUtils numberUtils = new NumberUtils();
        boolean victim = numberUtils.isEven(99);
        boolean expectedResult = true;
        if (victim){
            System.out.println("Should Detect Is Even Or Not TEST = TRUE");
        } else {
            System.out.println("Should Detect Is Even Or Not TEST = FALSE. Expected result: " + expectedResult + ". But real is : " + victim);
        }
    }
}
