package student_mihails_nikolajevs.lesson_10_junit.level_1_intern_;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface TaxCalculator {
     BigDecimal calculateTax(BigDecimal income);
}
