package student_stanislav_p.lesson_4_if_statement.level_5_middle;


/*

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")

Написать тестовые сценарии для класса LightColorDetector в классе LightColorDetectorTest.
Тестовые сценарии должны покрывать все возможные варианты.
 */

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.ColorTest(379,751,"Invisible Light");
        lightColorDetectorTest.ColorTest(380,449,"Violet");
        lightColorDetectorTest.ColorTest(450,494,"Blue");
        lightColorDetectorTest.ColorTest(495,569,"Green");
        lightColorDetectorTest.ColorTest(570,589,"Yellow");
        lightColorDetectorTest.ColorTest(590,619,"Orange");
        lightColorDetectorTest.ColorTest(620,750,"Red");




    }

    public void ColorTest(int waveLengthRange1, int waveLengthRange2, String typeOfColor) {
        int wavelengthRange1 = waveLengthRange1;
        int wavelengthRange2 = waveLengthRange2;

        String expectedResult = typeOfColor;

        LightColorDetector lightColorDetector = new LightColorDetector();

        String realResult = lightColorDetector.detect(wavelengthRange1);

        if (realResult == expectedResult) {
            System.out.println("Light Color Detector Test one "+ wavelengthRange1+ " for "+ typeOfColor + " is OK");
        } else {
            System.out.println("ight Color Detector Test one "+ wavelengthRange2+ " for "+ typeOfColor + " is Failed");
        }

        realResult = lightColorDetector.detect(wavelengthRange2);

        if (realResult == expectedResult) {
            System.out.println("Light Color Detector Test two "+ wavelengthRange2+ " for " + typeOfColor + " is OK");
        } else {
            System.out.println("Light Color Detector Test two "+ wavelengthRange2+ " for " + typeOfColor + " is Failed");
        }
    }




}
