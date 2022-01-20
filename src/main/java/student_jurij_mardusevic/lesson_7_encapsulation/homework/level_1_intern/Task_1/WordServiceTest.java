package student_jurij_mardusevic.lesson_7_encapsulation.homework.level_1_intern.Task_1;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.Check();
    }

    void Check() {
        String expected = "a";
        WordServiceTest wordService = new WordServiceTest();
        String actual = String.valueOf(WordService.print());
        boolean condition = (expected.equals(actual));
        check(condition, "Check");
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK ");
        } else
            System.out.println(testName + "FAILED ");
    }
}
