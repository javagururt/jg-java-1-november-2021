package teacher.lesson_10_junit.lessoncode.shoppinglist.dto.error;

public enum ErrorCode {

    SL_IE_500("Internal Server", 500),
    SL_CE_400("Client error", 400),
    SL_VE_4312("Product name validation error", 400),
    SL_VE_4313("Product price validation error", 400);

    private String description;
    private int statusCode;

    ErrorCode(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }
}
