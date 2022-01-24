package student_rolands_gudels.lesson_7_encapsulation.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.Check();
    }

    void Check() {
        String expected = "a";
        Task_1 task_1 = new Task_1();
        String actual = Task_1.print();
        boolean condition = (expected.equals(actual));
        check(condition, "Check");
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED");
        } else
            System.out.println(testName + " FAILED ");
    }
}

