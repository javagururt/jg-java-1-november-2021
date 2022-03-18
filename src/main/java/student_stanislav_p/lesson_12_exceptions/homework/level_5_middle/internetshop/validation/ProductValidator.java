package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import java.util.List;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
