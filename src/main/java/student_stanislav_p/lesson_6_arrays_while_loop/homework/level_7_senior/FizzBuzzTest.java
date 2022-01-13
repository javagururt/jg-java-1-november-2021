package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_7_senior;

import student_stanislav_p.lesson_4_if_statement.level_4_junior.Calculator;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest calculatorTest = new FizzBuzzTest();

        FizzBuzzTest.Test(15, "FizzBuzz", "Test 1 ( %3 and %5 ).");
        FizzBuzzTest.Test(9, "Fizz", "Test 2 ( %3 ).");
        FizzBuzzTest.Test(25, "Buzz", "Test 3 ( %5 ).");
        FizzBuzzTest.Test(52, " 52", "Test 4 ( other number ).");


    }

    //----------------- Test TEST -----------------------

    static void Test(int testNumber, String expectedResult, String nameTest) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String realResult = fizzBuzz.detect(testNumber);

        if (realResult.equals(expectedResult)) {
            System.out.println(nameTest +" Control is OK");
        } else {
            System.out.println(nameTest +" Control is FAIL");
            System.out.println("expectedResult " + expectedResult + " but realResult is "+ realResult);
        }
    }
    //--------------- конец теста ------------------


}
