package student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;


import student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface FieldValidationRule {

    void validate(Product product) throws ValidationException;
}
