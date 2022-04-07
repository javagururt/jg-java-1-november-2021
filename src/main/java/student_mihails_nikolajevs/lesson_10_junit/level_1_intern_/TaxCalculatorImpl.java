package student_mihails_nikolajevs.lesson_10_junit.level_1_intern_;

import java.math.BigDecimal;

import teacher.annotations.CodeReview;

/*
Вам поручили разработать калькулятор налогов.
В стране используется прогрессивная ставка налога.

Правило номер один:
- доход до 20000 облагается 25% налогом.

Создайте интерфейс TaxCalculator:

interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}
 */
@CodeReview(approved = true)
public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {

        int compareResult = income.compareTo(BigDecimal.valueOf(20000));
        if (compareResult > 0) {
            return (income.subtract(BigDecimal.valueOf(20000))
            .multiply(BigDecimal.valueOf(0.40))
                    .add(BigDecimal.valueOf(5000)));
        }
        return income.multiply(BigDecimal.valueOf(0.25));
    }
}
