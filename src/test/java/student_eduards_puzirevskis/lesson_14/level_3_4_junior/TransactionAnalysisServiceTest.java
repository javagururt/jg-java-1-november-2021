package student_eduards_puzirevskis.lesson_14.level_3_4_junior;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario","Milan");
    Trader alan = new Trader("Alan","Cambridge");
    Trader brian = new Trader("Brian","Cambridge");
    List<Transaction> victim = getTransactions();
    TransactionAnalysisService service = new TransactionAnalysisService();

    public List<Transaction> getTransactions() {
        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    @Test
    public void shouldFind2011YearTransactions() {
        List<Transaction> actual = service.findTransactionsByYear(victim, 2011);
        for (Transaction transaction:
             actual) {
            assertEquals(2011, transaction.getYear());
        }
    }

    @Test
    public void shouldFind2012YearTransactions() {
        List<Transaction> actual = service.findTransactionsByYear(victim, 2012);
        for (Transaction transaction:
                actual) {
            assertEquals(2012, transaction.getYear());
        }
    }

    @Test
    public void shouldNotFindYearTransactions() {
        List<Transaction> actual = service.findTransactionsByYear(victim, 2013);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void shouldSortTransactionsByValueIncrease() {
        List<Transaction> actual = service.sortTransactionsByValueIncrease(victim);
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000));
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < expected.size(); j++) {
                assertEquals(expected.get(i), actual.get(i));
            }
        }
    }

    @Test
    public void shouldSortTransactionsByValueInDecrease() {
        List<Transaction> actual = service.sortTransactionsByValueDecrease(victim);
        List<Transaction> expected = List.of(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < expected.size(); j++) {
                assertEquals(expected.get(i), actual.get(i));
            }
        }
    }

    @Test
    public void shouldSortTransactionsBy2011YearAndValueIncrease() {
        List<Transaction> actual = service.sortTransactionsByYearAndValueIncrease(victim,2011);
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < expected.size(); j++) {
                assertEquals(expected.get(i), actual.get(i));
            }
        }
    }

    @Test
    public void shouldFindTransactionsYear() {
        List<Integer> actual = service.findTransactionYear(victim);
        List<Integer> expected = List.of(2011,2012,2011,2012,2012,2012);
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < expected.size(); j++) {
                assertEquals(expected.get(i), actual.get(i));
            }
        }
    }

    @Test
    public void shouldFindTransactionsUniqueYear() {
        Set<Integer> actual = service.findTransactionUniqueYear(victim);
        Set<Integer> expected = Set.of(2011,2012);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldUniqueTraders() {
        Set<Trader> actual = service.findUniqueTraders(victim);
        Set<Trader> expected = Set.of(raoul,mario,alan,brian);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldUniqueTradersCities() {
        Set<String> actual = service.findUniqueTradersCities(victim);
        Set<String> expected = Set.of("Cambridge","Milan");
        assertEquals(actual, expected);
    }

    @Test
    public void shouldFindTradersNamesFromCambridge() {
        Set<String> actual = service.findTradersByCity(victim, "Cambridge");
        Set<String> expected = Set.of("Raoul","Alan","Brian");
        assertEquals(actual, expected);
    }

    @Test
    public void shouldFindTradersNamesFromMilano() {
        Set<String> actual = service.findTradersByCity(victim, "Milan");
        Set<String> expected = Set.of("Mario");
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotFindTradersNamesFromAnyCity() {
        Set<String> actual = service.findTradersByCity(victim, "London");
        assertTrue(actual.isEmpty());
    }



}