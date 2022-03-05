package student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
