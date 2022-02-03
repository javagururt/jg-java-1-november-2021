package student_andrei_karamnov.lesson_9_interfaces.homework.level_4_junior;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.fahrenheitConverterTest(new FahrenheitConverter());
        System.out.println();
        test.kelvinConverterTest(new KelvinConverter());
        System.out.println();
        test.celsiusConverterTest(new CelsiusConverter());

    }
    void fahrenheitConverterTest(TemperatureConverter converter){
        double realResult = 77;
        checkResult("Fahrenheit converter TEST: ", converter.convert(25), realResult);
    }
    void kelvinConverterTest(TemperatureConverter converter){
        double realResult = 298.15;
        checkResult("Kelvin converter TEST: ", converter.convert(25), realResult);
    }
    void celsiusConverterTest(TemperatureConverter converter){
        double realResult = 25;
        checkResult("Celsius converter TEST: ", converter.convert(25), realResult);
    }

    void checkResult(String testName, double actual, double expected){
        System.out.println("Actual result: " + actual);
        System.out.println("Expected result: " + expected);
        if (actual == expected){
            System.out.println(testName + " is OK");
        }else {
            System.out.println(testName + " FAILED");
        }
    }
}
