package java.student_mihails_nikolajevs.lesson_10_junit_.level_1_intern_;

import org.junit.Test;
import student_mihails_nikolajevs.lesson_10_junit.level_1_intern_.TaxCalculator;
import student_mihails_nikolajevs.lesson_10_junit.level_1_intern_.TaxCalculatorImpl;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
public class TaxCalculatorImplTest {


    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {

        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }
    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThan20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("2500.00"));
    }
    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualsTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }
    @Test
    public void  shouldPay40PercentTaxWhenIncomeBiggerThan20000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }

}
