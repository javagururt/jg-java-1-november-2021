package student_eduards_puzirevskis.lesson_4_if_statement.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.invisibleTestOne();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTestOne();
        lightColorDetectorTest.redTestTwo();
        lightColorDetectorTest.invisibleTestTwo();
    }
    public void invisibleTestOne() {
        int wavelength = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Invisible One = OK");
        } else {
            System.out.println("Light Color Detector Test Invisible One = Failed");
        }
    }
    public void violetTest() {
        int wavelength = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Violet = OK");
        } else {
            System.out.println("Light Color Detector Test Violet = Failed");
        }
    }
    public void blueTest() {
        int wavelength = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Blue = OK");
        } else {
            System.out.println("Light Color Detector Test Blue = Failed");
        }
    }
    public void greenTest() {
        int wavelength = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Green = OK");
        } else {
            System.out.println("Light Color Detector Test Green = Failed");
        }
    }
    public void yellowTest() {
        int wavelength = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Yellow = OK");
        } else {
            System.out.println("Light Color Detector Test Yellow = Failed");
        }
    }
    public void orangeTest() {
        int wavelength = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Orange = OK");
        } else {
            System.out.println("Light Color Detector Test Orange = Failed");
        }
    }
    public void redTestOne() {
        int wavelength = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Red One = OK");
        } else {
            System.out.println("Light Color Detector Test Red One = Failed");
        }
    }
    public void redTestTwo() {
        int wavelength = 750;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Red Two = OK");
        } else {
            System.out.println("Light Color Detector Test Red Two = Failed");
        }
    }
    public void invisibleTestTwo() {
        int wavelength = 751;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light Color Detector Test Invisible Two = OK");
        } else {
            System.out.println("Light Color Detector Test Invisible Two = Failed");
        }
    }

}
