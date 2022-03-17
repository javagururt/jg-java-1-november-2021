package student_dmitrijs_sinkevics.lesson_9.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.kelvinConverterTest();
        test.fahrenheitConverterTest();

    }

    void kelvinConverterTest(){
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expectedResult= 283.15;
        double realResult= kelvinConverter.convert(10);

        if (realResult == expectedResult) {
            System.out.println("kelvinConverterTest = OK");
        } else {
            System.out.println("kelvinConverterTest = FAIL");
        }
    }

    void fahrenheitConverterTest(){
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

        double expectedResult= 50;
        double realResult= fahrenheitConverter.convert(10);

        if (realResult == expectedResult) {
            System.out.println("fahrenheitConverterTest = OK");
        } else {
            System.out.println("fahrenheitConverterTest = FAIL");
        }
    }
}
