package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

public class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
