package student_andrei_karamnov.lesson_12_exceptions.homework.level_3_junior;

/*Какой результат мы получим?
1. Got the Test Exception
   Inside finally block

2. Got the Test Exception

3. Inside finally block

4. Compiler Error*/

/*Получим 1. Блок catch отработает. Блок finally отрабатывает всегда, независимо от исхода в try-catch.*/
public class TestException extends Exception{
}

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
