package student_mihails_nikolajevs.lesson_12_exceptions_.level_3_junior;

import teacher.annotations.CodeReview;

/*
Какой результат мы получим?
1. Got the Test Exception
   Inside finally block

2. Got the Test Exception

3. Inside finally block

4. Compiler Error
 */
@CodeReview(approved = true)
public class TestException extends Exception {}

    class Main {
        public static void main(String args[]) {
            try {
                throw new TestException();
            } catch(TestException t) {
                System.out.println("Got the Test Exception");
            } finally {
                System.out.println("Inside finally block ");
            }
        }
    }

// Output : 1. Got the Test Exception  // CATCH IS DONE
//          2. Inside finally block    // FINALLY ALWAYS WILL BE DONE !