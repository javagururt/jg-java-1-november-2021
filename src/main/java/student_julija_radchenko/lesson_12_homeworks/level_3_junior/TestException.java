package student_julija_radchenko.lesson_12_homeworks.level_3_junior;
//Результат - Got the Test Exception
//             Inside finally block
//блок catch отработает, и блок finally отработает в любом случае.

public class TestException extends Exception { }

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
