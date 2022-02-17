package teacher.lesson_11_part2.lessoncode.shoppinglist.businesslogic;

import java.util.Arrays;

import teacher.lesson_11_part2.lessoncode.shoppinglist.domain.Product;
import teacher.lesson_11_part2.lessoncode.shoppinglist.dto.error.ErrorCode;
import teacher.lesson_11_part2.lessoncode.shoppinglist.dto.error.ErrorDto;

public class ValidationServiceV2 {

    public ErrorDto[] validate(Product product) {
        ErrorDto[] errors = new ErrorDto[0];
        if (product.getName() == null) {
            ErrorDto errorDto = new ErrorDto(ErrorCode.SL_VE_4312, "Product name must not be null");
            errors = addError(errors, errorDto);
        }
        if (product.getPrice() == null) {
            ErrorDto errorDto = new ErrorDto(ErrorCode.SL_VE_4313, "Product price must not be null");
            errors = addError(errors, errorDto);
        }
        if (product.getName().length() < 3) {
            ErrorDto errorDto = new ErrorDto(ErrorCode.SL_VE_4312, "Product name length should be greater 3");
            errors = addError(errors, errorDto);
        }

        return errors;
    }


    private ErrorDto[] addError(ErrorDto[] errors, ErrorDto error) {
        ErrorDto[] newErrors = Arrays.copyOf(errors, errors.length + 1);
        newErrors[errors.length] = error;
        return newErrors;
    }


}
