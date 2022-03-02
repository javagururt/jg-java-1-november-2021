package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
