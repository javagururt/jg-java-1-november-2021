package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

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

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    public void invisibleTestOne() {
        int wavelength = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Invisible One");
    }

    public void violetTest() {
        int wavelength = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Violet");
    }

    public void blueTest() {
        int wavelength = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Blue");
    }

    public void greenTest() {
        int wavelength = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Green");
    }

    public void yellowTest() {
        int wavelength = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Yellow");
    }

    public void orangeTest() {
        int wavelength = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Orange");
    }

    public void redTestOne() {
        int wavelength = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Red One");
    }

    public void redTestTwo() {
        int wavelength = 750;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Red Two");
    }

    public void invisibleTestTwo() {
        int wavelength = 751;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        checkTestResult(realResult.equals(expectedResult), "Light Color Detector Test Invisible Two");
    }

}
