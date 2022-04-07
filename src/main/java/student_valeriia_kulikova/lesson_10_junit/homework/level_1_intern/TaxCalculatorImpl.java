package student_valeriia_kulikova.lesson_10_junit.homework.level_1_intern;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "BigDecimal.valueOf(0) можно заменить на константу BigDecimal.ZERO." +
        "А в примере по сути это лишнее, так как нету обращения к tax перед if." +
        "tax.setScale(2) - лучше добавить rounding mode (как округлять). Например:" +
        "tax.setScale(2, RoundingMode.HALF_EVEN)")
public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal tax = BigDecimal.valueOf(0);

        if (income.compareTo(BigDecimal.valueOf(20000.01)) == -1) {
            tax = income.multiply(BigDecimal.valueOf(0.25));
        } else {
            BigDecimal tax1 = (income.subtract(BigDecimal.valueOf(20000.00)));
            BigDecimal tax2 = tax1.multiply(BigDecimal.valueOf(0.40));
            tax = tax2.add(BigDecimal.valueOf(5000.00));
        }
        return tax.setScale(2);
    }
}
