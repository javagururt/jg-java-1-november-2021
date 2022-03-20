package student_valeriia_kulikova.lesson_12_exceptions.homework.level_1_intern.Task_4;

public class MyExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        try {
            if (a > 5) {
                throw new MyException("Our number > 5.");
            }

        }
        catch (MyException exception) {
            System.out.println(exception);
        }
    }
}
