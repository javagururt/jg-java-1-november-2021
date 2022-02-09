package student_stanislav_p.lesson_9_interfaces.homework.level_4_junior;

public class TemperatureConverterTest {
    public static void main(String[] args) {

        TemperatureConverterTest test = new TemperatureConverterTest();

        test.fahrenheitConverterTest(new FahrenheitConverter());

        test.kelvinConverterTest(new KelvinConverter());

        test.celsiusConverterTest(new CelsiusConverter());

    }
    void celsiusConverterTest(TemperatureConverter converter){
        double realResult = 0;
        checkResult("TEST №1 (Celsius): ", converter.convert(0), realResult);
    }

    void fahrenheitConverterTest(TemperatureConverter converter){
        double realResult = 32;
        checkResult("TEST №2 (Fahrenheit): ", converter.convert(0), realResult);
    }

    void kelvinConverterTest(TemperatureConverter converter){
        double realResult = 273.15;
        checkResult("TEST №3 (Kelvin): ", converter.convert(0), realResult);
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
