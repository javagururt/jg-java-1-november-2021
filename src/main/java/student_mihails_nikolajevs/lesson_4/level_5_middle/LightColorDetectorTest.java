package student_mihails_nikolajevs.lesson_4.level_5_middle;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest LCDTest = new LightColorDetectorTest();
        LCDTest.Test( 379, 751," Invisible Light ");
        LCDTest.Test( 380, 449, " Violet ");
        LCDTest.Test( 450, 494, " Blue ");
        LCDTest.Test( 495, 569, " Green ");
        LCDTest.Test( 570, 589, " Yellow ");
        LCDTest.Test( 590, 619, " Orange ");
        LCDTest.Test( 620, 750, " Red ");

    }

    public void Test(int waveLength1, int waveLength2, String color) {

        int a = waveLength1;
        int b = waveLength2;

        String expectedResult = color;

        LightColorDetector lightColorDetector = new LightColorDetector();

        String realResult = lightColorDetector.detect(waveLength1);

        if (realResult == expectedResult) {

            System.out.println("First Light Color Detector Test " + a + " which is " + color + " is OK ");
        } else {
            System.out.println("First Light Color Detector Test " + a + " which is " + color + " is Failed ");

        }

        realResult = lightColorDetector.detect(waveLength2);

        if (realResult == expectedResult) {
            System.out.println("Second Light Color Detector Test " + b + " which is " + color + " is OK ");
        } else {
            System.out.println("Second Light Color Detector Test " + b + " which is " + color + " is Failed ");
        }

    }


}
