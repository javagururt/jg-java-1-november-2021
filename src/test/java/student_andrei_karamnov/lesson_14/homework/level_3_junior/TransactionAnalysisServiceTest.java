package student_andrei_karamnov.lesson_14.homework.level_3_junior;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {


        TransactionTestData data = new TransactionTestData();
        List<Transaction> victim = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();


    @Test
    public void shouldFind2011YearTransactions() {
        List<Transaction> actual = service.findTransactionsByYear(victim, 2011);
        for(Transaction t : actual){
            assertEquals(2011, t.getYear());
        }
    }
    @Test
    public void shouldFind2012YearTransactions() {
        List<Transaction> actual = service.findTransactionsByYear(victim, 2012);
        for(Transaction t : actual){
            assertEquals(2012, t.getYear());
        }
    }
    @Test
    public void shouldNotFindYearTransactions() {
        List<Transaction> actual = service.findTransactionsByYear(victim, 2013);
        assertTrue(actual.isEmpty());
    }
    @Test
    public void shouldSortTransactionsByValueIncrease(){
        List<Transaction> actual = service.sortTransactionsByValueIncrease(victim);
        List<Transaction> expected = List.of(
                new Transaction(data.brian, 2011, 300),
                new Transaction(data.raoul, 2011, 400),
                new Transaction(data.mario, 2012, 700),
                new Transaction(data.mario, 2012, 710),
                new Transaction(data.alan, 2012, 950),
                new Transaction(data.raoul, 2012, 1000));
            assertTrue(actual.equals(expected));
        }
    @Test
    public void shouldSortTransactionsByValueDecrease(){
        List<Transaction> actual = service.sortTransactionsByValueDecrease(victim);
        List<Transaction> expected = List.of(
                new Transaction(data.raoul, 2012, 1000),
                new Transaction(data.alan, 2012, 950),
                new Transaction(data.mario, 2012, 710),
                new Transaction(data.mario, 2012, 700),
                new Transaction(data.raoul, 2011, 400),
                new Transaction(data.brian, 2011, 300));
        assertTrue(actual.equals(expected));
    }
    @Test
    public void shouldSortTransactionsByYear2011AndValueIncrease(){
        List<Transaction> actual = service.sortTransactionsByYearAndValueIncrease(victim, 2011);
        List<Transaction> expected = List.of(
                new Transaction(data.brian, 2011, 300),
                new Transaction(data.raoul, 2011, 400));
        assertTrue(actual.equals(expected));
    }
    @Test
    public void shouldFindTransactionsYear(){
        List<Integer> actual = service.findTransactionYear(victim);
        List<Integer> expected = List.of(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindTransactionsUniqueYear(){
        List<Integer> actual = service.findTransactionUniqueYear(victim);
        List<Integer> expected = List.of(2011, 2012);
        assertEquals(expected, actual);
    }
    @Test
    public  void shouldFindUniqueTraders(){
        List<Trader> actual = service.findUniqueTraders(victim);
        List<Trader> expected = List.of(data.brian, data.raoul, data.mario, data.alan);
        assertEquals(expected, actual);
    }
    @Test
    public  void shouldFindUniqueTradersCities(){
        List<String> actual = service.findUniqueTradersCities(victim);
        List<String> expected = List.of("Cambridge", "Milan");
        assertEquals(expected, actual);
    }
    @Test
    public  void shouldFindTraderNamesByCambridge(){
        List<String> actual = service.findTraderNamesByCity(victim, "Cambridge");
        List<String> expected = List.of("Alan", "Brian", "Raoul");
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindTraderNamesByMilan(){
        List<String> actual = service.findTraderNamesByCity(victim, "Milan");
        List<String> expected = List.of("Mario");
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotFindTradersNamesFromAnyCity() {
       List<String> actual = service.findTraderNamesByCity(victim, "Tallinn");
        assertTrue(actual.isEmpty());
    }
    }
