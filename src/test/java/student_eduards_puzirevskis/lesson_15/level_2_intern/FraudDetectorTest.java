package student_eduards_puzirevskis.lesson_15.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector victim = new FraudDetector();
    Trader firstFraud = new Trader("Pokemon", "Sidney");
    Trader secondFraud = new Trader("Pokemon", "Riga");
    Trader thirdFraud = new Trader("Lincoln", "Sidney");
    Trader notFraud = new Trader("Lincoln", "Riga");


    @Test
    public void shouldDetectFraudByNameAndCity() {
        assertFalse(victim.doesThisTraderIsSafe(firstFraud));
    }

    @Test
    public void shouldDetectFraudByName() {
        assertFalse(victim.doesThisTraderIsSafe(secondFraud));
    }

    @Test
    public void shouldDetectFraudByCity() {
        assertFalse(victim.doesThisTraderIsSafe(thirdFraud));
    }

    @Test
    public void shouldNotDetectFraud() {
        assertTrue(victim.doesThisTraderIsSafe(notFraud));
    }

}