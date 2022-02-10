package student_andrei_karamnov.lesson_10_junit.level_1_intern;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}
