package student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import java.util.List;

import student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
