package teacher.lesson_12_exceptions.lessoncode.exceptions;

class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
