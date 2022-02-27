package student_andrei_karamnov.lesson_12_exceptions.homework.level_1_intern;

public class Task_4 {
}

class MyException extends Exception {

    private String name;

    public MyException(String message, String name) {
        super(message);
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "name=" + name +
                 ", message=" + getMessage() +
                '}';
    }
}
