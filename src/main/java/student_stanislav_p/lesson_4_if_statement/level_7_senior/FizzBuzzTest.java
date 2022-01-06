package student_stanislav_p.lesson_4_if_statement.level_7_senior;


public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean testResult = fizzBuzz.control(30).equals("FizzBuzz");
        checkTest("Test #1 'FizzBuzz'", testResult);
    }

    public void fizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean testResult = fizzBuzz.control(9).equals("Fizz");
        checkTest("Test #2 'Fizz'", testResult);
    }

    public void buzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean testResult = fizzBuzz.control(10).equals("Buzz");
        checkTest("Test #3 'Buzz'", testResult);
    }

    public void notFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean testResult = fizzBuzz.control(17).equals(" "+ 17);
        checkTest("Test #4 'NotFizzBuzz'", testResult);
    }

   void checkTest (String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

}