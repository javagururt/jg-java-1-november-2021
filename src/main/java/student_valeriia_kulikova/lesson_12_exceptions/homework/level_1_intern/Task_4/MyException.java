package student_valeriia_kulikova.lesson_12_exceptions.homework.level_1_intern.Task_4;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MyException {"
                + " message: " + getMessage()
                +"}";
    }
}
