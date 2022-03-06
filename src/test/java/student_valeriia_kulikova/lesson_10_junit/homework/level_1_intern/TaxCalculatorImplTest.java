package student_valeriia_kulikova.lesson_10_junit.homework.level_1_intern;

import  org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class TaxCalculatorImplTest {
    TaxCalculator taxCalculator = new TaxCalculatorImpl();
    @Test
    public void test1 () {
        BigDecimal income = BigDecimal.valueOf(10000.00);
        BigDecimal taxTest = BigDecimal.valueOf(2500.00);
        BigDecimal testResult = taxCalculator.calculateTax(income);
        assertEquals(testResult.setScale(2), taxTest.setScale(2));
    }

    private TaxCalculator taxCalculator2 = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator2.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator2.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator2.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }
}