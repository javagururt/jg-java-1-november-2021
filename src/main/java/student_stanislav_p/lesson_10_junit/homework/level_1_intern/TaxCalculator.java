package student_stanislav_p.lesson_10_junit.homework.level_1_intern;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface TaxCalculator {
    BigDecimal calculateTax(BigDecimal income);

}
