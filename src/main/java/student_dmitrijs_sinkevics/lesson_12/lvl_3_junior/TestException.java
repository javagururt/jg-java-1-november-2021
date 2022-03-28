package student_dmitrijs_sinkevics.lesson_12.lvl_3_junior;

public class TestException extends Exception { }

/*
    Какой результат мы получим?
        1. Got the Test Exception
        Inside finally block

 */

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

