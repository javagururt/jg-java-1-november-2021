package student_victor_veselov.lesson_4.Task16;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest.violetColorTest();
        LightColorDetectorTest.blueColorTest();
        LightColorDetectorTest.greenColorTest();
        LightColorDetectorTest.yellowColorTest();
        LightColorDetectorTest.orangeColorTest();
        LightColorDetectorTest.redColorTest();

    }

    public static void violetColorTest() {
        int wavelength = 440;
        String colorResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);

        if (colorResult.equals(realResult)) {
            System.out.println("Violet Test accepted");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void blueColorTest() {
        int wavelength = 455;
        String colorResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);

        if (colorResult.equals(realResult)) {
            System.out.println("Blue Test accepted");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void greenColorTest() {
        int wavelength = 555;
        String colorResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);

        if (colorResult.equals(realResult)) {
            System.out.println("Green Test accepted");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void yellowColorTest() {
        int wavelength = 575;
        String colorResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);

        if (colorResult.equals(realResult)) {
            System.out.println("Yellow Test accepted");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void orangeColorTest() {
        int wavelength = 610;
        String colorResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);

        if (colorResult.equals(realResult)) {
            System.out.println("Orange Test accepted");
        } else {
            System.out.println("Test failed!");
        }
    }

    public static void redColorTest() {
        int wavelength = 725;
        String colorResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);

        if (colorResult.equals(realResult)) {
            System.out.println("Red Test accepted");
        } else {
            System.out.println("Test failed!");
        }
    }
}