package student_valeriia_kulikova.lesson_12_exceptions.homework.level_1_intern.Task_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MyException {"
                + " message: " + getMessage()
                + "}";
    }
}
