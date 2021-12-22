package student_rolands_gudels.lesson4_if_statement.level_5_middle;

import student_rolands_gudels.lesson4_if_statement.level_4_junior.Task_11;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetBorderTestOne();
        lightColorDetectorTest.violetBorderTestTwo();
        lightColorDetectorTest.blueBorderTestOne();
        lightColorDetectorTest.blueBorderTestTwo();
        lightColorDetectorTest.greenBorderTestOne();
        lightColorDetectorTest.greenBorderTestTwo();
        lightColorDetectorTest.yellowBorderTestOne();
        lightColorDetectorTest.yellowBorderTestTwo();
        lightColorDetectorTest.orangeBorderTestOne();
        lightColorDetectorTest.orangeBorderTestTwo();
        lightColorDetectorTest.redBorderTestOne();
        lightColorDetectorTest.redBorderTestTwo();
        lightColorDetectorTest.underRangeUnderVioletSpectre();
        lightColorDetectorTest.underRangeUnderRedSpectre();

    }

    //class LightColorDetector {
    //    public String detect(int wavelength) {
    //        if (wavelength >= 380 && wavelength <= 449) {
    //            return "Violet";
    //        } else if (wavelength >= 450 && wavelength <= 494) {
    //            return "Blue";
    //        } else if (wavelength >= 495 && wavelength <= 569) {
    //            return "Green";
    //        } else if (wavelength >= 570 && wavelength <= 589) {
    //            return "Yellow";
    //        } else if (wavelength >= 590 && wavelength <= 619) {
    //            return "Orange";
    //        } else if (wavelength >= 620 && wavelength <= 750) {
    //            return "Red";
    //        } else {
    //            return "Invisible Light";
    public void violetBorderTestOne() {
            int enteredNumber = 380;
            String expectedResult = "Violet";
            LightColorDetector detector = new LightColorDetector();
            if (expectedResult.equals(detector.detect(enteredNumber))) {
             System.out.println("Violet Border Test One = OK");
            } else { System.out.println("Violet Border Test One = FAIL");
            }
        }
    public void violetBorderTestTwo() {
        int enteredNumber = 449;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Violet Border Test Two = OK");
        } else { System.out.println("Violet Border Test Two = FAIL");
        }
    }
    public void blueBorderTestOne() {
        int enteredNumber = 450;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Blue Border Test One = OK");
        } else { System.out.println("Blue Border Test One = FAIL");
        }
    }
    public void blueBorderTestTwo() {
        int enteredNumber = 494;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Blue Border Test Two = OK");
        } else { System.out.println("Blue Border Test Two = FAIL");
        }
    }
    public void greenBorderTestOne() {
        int enteredNumber = 495;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Green Border Test One = OK");
        } else { System.out.println("Green Border Test One = FAIL");
        }
    }
    public void greenBorderTestTwo() {
        int enteredNumber = 569;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Green Border Test Two = OK");
        } else { System.out.println("Green Border Test Two = FAIL");
        }
    }
    public void yellowBorderTestOne() {
        int enteredNumber = 570;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Yellow Border Test One = OK");
        } else { System.out.println("Yellow Border Test One = FAIL");
        }
    }
    public void yellowBorderTestTwo() {
        int enteredNumber = 589;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Yellow Border Test Two = OK");
        } else { System.out.println("Yellow Border Test Two = FAIL");
        }
    }
    public void orangeBorderTestOne() {
        int enteredNumber = 590;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Orange Border Test One = OK");
        } else { System.out.println("Orange Border Test One = FAIL");
        }
    }
    public void orangeBorderTestTwo() {
        int enteredNumber = 619;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Orange Border Test Two = OK");
        } else { System.out.println("Orange Border Test Two = FAIL");
        }
    }
    public void redBorderTestOne() {
        int enteredNumber = 620;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Red Border Test One = OK");
        } else { System.out.println("Red Border Test One = FAIL");
        }
    }
    public void redBorderTestTwo() {
        int enteredNumber = 750;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Red Border Test Two = OK");
        } else { System.out.println("Red Border Test Two = FAIL");
        }
    }
    public void underRangeUnderVioletSpectre() {
        int enteredNumber = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Under Range Under Violet Spectre Test One = OK");
        } else { System.out.println("Under Range Under Violet Spectre Test One = FAIL");
        }
    }
    public void underRangeUnderRedSpectre() {
        int enteredNumber = 751;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        if (expectedResult.equals(detector.detect(enteredNumber))) {
            System.out.println("Under Range Under Red Spectre Test Two = OK");
        } else { System.out.println("Under Range Under Red Spectre Test Two = FAIL");
        }
    }
        }


