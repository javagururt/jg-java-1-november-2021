package student_valeriia_kulikova.lesson_12_exceptions.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TestException extends Exception {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch (TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

/*
        1. Got the Test Exception
           Inside finally block
   */