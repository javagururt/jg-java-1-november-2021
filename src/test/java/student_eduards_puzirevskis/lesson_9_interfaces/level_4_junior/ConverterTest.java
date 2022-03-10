package student_eduards_puzirevskis.lesson_9_interfaces.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void convertFahrenheit() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actual = fahrenheitConverter.convert(36.00);
        double expected = 96.8;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void convertKelvin() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actual = kelvinConverter.convert(36.00);
        double expected = 309.15;
        assertEquals(expected,actual,0.0001);
    }
}
