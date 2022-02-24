package teacher.lesson_12_exceptions.lessoncode.shoppinglist.validation;

public class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
