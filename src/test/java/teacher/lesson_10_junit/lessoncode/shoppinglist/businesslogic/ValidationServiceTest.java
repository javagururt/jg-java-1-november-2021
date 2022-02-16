package teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic;

import org.junit.Test;

import java.math.BigDecimal;

import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationServiceTest {

    private ValidationService victim = new ValidationService();

    @Test
    public void shouldReturnTrueForValidProduct() {
        Product product = new Product();
        product.setName("Apple");
        product.setPrice(new BigDecimal("10"));

        boolean actual = victim.validate(product);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNameIsNull() {
        Product product = new Product();
        product.setName(null);
        product.setPrice(new BigDecimal("10"));

        boolean actual = victim.validate(product);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseWhenNameLengthLessThanMin() {
        Product product = new Product();
        product.setName("Ap");
        product.setPrice(new BigDecimal("10"));

        boolean actual = victim.validate(product);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseWhenNameLengthGreaterThanMax() {
        Product product = new Product();
        product.setName("AAAAAAAAAAA");
        product.setPrice(new BigDecimal("10"));

        boolean actual = victim.validate(product);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseWhenPriceIsNull() {
        Product product = new Product();
        product.setName("Apple");
        product.setPrice(null);

        boolean actual = victim.validate(product);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseWhenPriceIsZero() {
        Product product = new Product();
        product.setName("Apple");
        product.setPrice(BigDecimal.ZERO);

        boolean actual = victim.validate(product);
        assertFalse(actual);
    }
}