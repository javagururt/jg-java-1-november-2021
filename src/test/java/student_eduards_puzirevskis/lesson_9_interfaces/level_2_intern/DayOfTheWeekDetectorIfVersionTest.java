package student_eduards_puzirevskis.lesson_9_interfaces.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionTest {
    DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();

    @Test
    public void shouldDetectMonday() {
        String expected = "Monday";
        String actual = day.detectDayName(1);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectTuesday() {
        String expected = "Tuesday";
        String actual = day.detectDayName(2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectWednesday() {
        String expected = "Wednesday";
        String actual = day.detectDayName(3);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectThursday() {
        String expected = "Thursday";
        String actual = day.detectDayName(4);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectFriday() {
        String expected = "Friday";
        String actual = day.detectDayName(5);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectSaturday() {
        String expected = "Saturday";
        String actual = day.detectDayName(6);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectSunday() {
        String expected = "Sunday";
        String actual = day.detectDayName(7);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDetectWrongNumber() {
        String expected = "Please input a valid number between 1 and 7";
        String actual = day.detectDayName(8);

        assertEquals(expected, actual);
    }
}