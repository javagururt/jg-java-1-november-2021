package teacher.lesson_10_junit.lessoncode.shoppinglist.dto;

import java.util.Arrays;

import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;
import teacher.lesson_10_junit.lessoncode.shoppinglist.dto.error.ErrorDto;

public class AddProductResult {

    private ErrorDto[] errors = new ErrorDto[0];
    private Product product;

    public ErrorDto[] getErrors() {
        return errors;
    }

    public void setErrors(ErrorDto[] errors) {
        this.errors = errors;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "AddProductResult{" +
                "errors=" + Arrays.toString(errors) +
                ", product=" + product +
                '}';
    }
}
