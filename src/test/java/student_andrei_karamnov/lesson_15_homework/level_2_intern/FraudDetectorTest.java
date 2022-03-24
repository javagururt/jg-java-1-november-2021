package student_andrei_karamnov.lesson_15_homework.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    FraudDetector victim = new FraudDetector();
    Trader firstTrader = new Trader("Pokemon", "Sidney");
    Trader secondTrader = new Trader("Andrei", "Moscow");
    Trader thirdTrader = new Trader("Pokemon", "Tallinn");
    Trader fourthTrader = new Trader("Petja", "Sidney");

    @Test
    public void shouldDetectFraudByNameAndCity() {
        assertFalse(victim.isValidatedTrader(firstTrader));
    }

    @Test
    public void shouldDetectFraudByName() {
        assertFalse(victim.isValidatedTrader(thirdTrader));
    }

    @Test
    public void shouldDetectFraudByCity() {
        assertFalse(victim.isValidatedTrader(fourthTrader));
    }

    @Test
    public void shouldNotDetectFraud() {
        assertTrue(victim.isValidatedTrader(secondTrader));
    }

}