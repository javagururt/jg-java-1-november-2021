package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

public class ValidationException extends RuntimeException {

    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
