package student_julija_radchenko.lesson_10_homeworks;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface TaxCalculator {


    BigDecimal calculateTax(BigDecimal income);

}
