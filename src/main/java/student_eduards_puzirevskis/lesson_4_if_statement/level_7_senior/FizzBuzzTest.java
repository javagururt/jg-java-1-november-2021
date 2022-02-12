package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldReturnFizz();
        test.shouldReturnBuzz();
        test.shouldReturnFizzBuzz();
        test.shouldReturnNumber();
    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);
        String expectedResult = "Fizz";
        checkTestResult(Objects.equals(realResult, expectedResult), "Should Return Fizz Test");
    }

    public void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(5);
        String expectedResult = "Buzz";
        checkTestResult(Objects.equals(realResult, expectedResult), "Should Return Buzz Test");
    }

    public void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";
        checkTestResult(Objects.equals(realResult, expectedResult), "Should Return FizzBuzz Test");
    }

    public void shouldReturnNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(4);
        String expectedResult = "" + 4;
        checkTestResult(Objects.equals(realResult, expectedResult), "Should Return Number Test");
    }

}
