package student_stanislav_p.lesson_9_interfaces.homework.level_4_junior;

public class TemperatureConverterTest {
    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();

        test.fahrenheitConverterTest(new FahrenheitConverter());

        test.kelvinConverterTest(new KelvinConverter());

        test.celsiusConverterTest(new CelsiusConverter());

    }
    void fahrenheitConverterTest(TemperatureConverter converter){
        double realResult = 32;
        checkResult("Fahrenheit converter TEST: ", converter.convert(0), realResult);
    }
    void kelvinConverterTest(TemperatureConverter converter){
        double realResult = 273.15;
        checkResult("Kelvin converter TEST: ", converter.convert(0), realResult);
    }
    void celsiusConverterTest(TemperatureConverter converter){
        double realResult = 0;
        checkResult("Celsius converter TEST: ", converter.convert(0), realResult);
    }

    void checkResult(String testName, double actual, double expected){

        if (actual == expected){
            System.out.println(testName + " is OK");
        }else {
            System.out.println(testName + " FAILED");
            System.out.println("Actual result: " + actual);
            System.out.println("Expected result: " + expected);
        }
    }
}
