package student_andrei_karamnov.lesson_4_if_statement.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();

    }
    public void fizzBuzzTest(){
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String realResult = fizzBuzzTest.detect(15);
        if (realResult == expectedResult){System.out.println("Test completed");
    }
        else {System.out.println("Test FAILED");
    }
    }
    public void fizzTest(){
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String realResult = fizzBuzzTest.detect(9);
        if (realResult == expectedResult){System.out.println("Test completed");
        }
        else {System.out.println("Test FAILED");
        }
    }
    public void buzzTest(){
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String realResult = fizzBuzzTest.detect(10);
        if (realResult == expectedResult){System.out.println("Test completed");
        }
        else {System.out.println("Test FAILED");
        }
    }
    }

