package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_1_intern;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.shouldDetectIsEvenOrNot();
    }

    public void shouldDetectIsEvenOrNot() {
        NumberUtils numberUtils = new NumberUtils();
        boolean victim = numberUtils.isEven(10);
        boolean expectedResult = true;
        if (victim){
            System.out.println("Should Detect Is Even Or Not TEST = TRUE");
        } else {
            System.out.println("Should Detect Is Even Or Not TEST = FALSE. Expected result: " + expectedResult + ". But real is : " + victim);
        }
    }



}
