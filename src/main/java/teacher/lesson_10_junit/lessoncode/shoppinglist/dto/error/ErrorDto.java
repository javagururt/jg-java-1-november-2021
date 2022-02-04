package teacher.lesson_10_junit.lessoncode.shoppinglist.dto.error;

public class ErrorDto {

    private ErrorCode errorCode;
    private String errorDescription;

    public ErrorDto(ErrorCode errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    @Override
    public String toString() {
        return "ErrorDto{" +
                "errorCode=" + errorCode +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }
}
