package student_valeriia_kulikova.lesson_9_interfaces.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TemperatureConverterTest {
    TemperatureConverter type;

    public TemperatureConverterTest(TemperatureConverter type) {
        this.type = type;
    }


    public static void main(String[] args) {
        TemperatureConverterTest type2 = new TemperatureConverterTest(new CelsiusConverter());
        double testResult = type2.celsiusConverterTest(10);
        type2.checkResult("Test 1 (celsius temperature)",testResult,10);
        TemperatureConverterTest type3 = new TemperatureConverterTest(new FahrenheitConverter());
        double testResult2 = type3.fahrenheitConverterTest(10);
        type3.checkResult("Test 2 (Fahrenheit temperature)", testResult2,50);
        TemperatureConverterTest type4 = new TemperatureConverterTest(new KelvinConverter());
        double testResult3 = type4.kelvinConverterTemperature(10);
        type4.checkResult("Test 3 (Kelvin temperature)", testResult3,283.15);

    }

    double celsiusConverterTest (double celsiusTemperature) { return type.convert(celsiusTemperature);}

    double fahrenheitConverterTest ( double celsiusTemperature) {
        return type.convert(celsiusTemperature);
    }

    double kelvinConverterTemperature ( double celsiusTemperature) {
        return type.convert(celsiusTemperature);
    }

    void checkResult (String testName, double actualTemperature, double expectedResult) {
        if (actualTemperature == expectedResult) {
            System.out.println(testName+ " is  OK.");
        } else {
            System.out.println(testName+  " is FALSE.");
        }
    }


}
