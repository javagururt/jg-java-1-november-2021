package student_andrei_karamnov.lesson_4_if_statement.level_5_middle;

class LightColorDetectorTest {
    public static void main(String[] args) {
    LightColorDetectorTest detectorTest = new LightColorDetectorTest();
    detectorTest.detectViolet();
    detectorTest.detectBlue();
    detectorTest.detectGreen();
    detectorTest.detectYellow();
    detectorTest.detectOrange();
    detectorTest.detectRed();
    detectorTest.detectNothing();
    }
    public void detectViolet(){
        int wavelenght = 430;
        String expectedDetect = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Violet light detected");
        }else {
            System.out.println("Test failed");
    }
}
    public void detectBlue(){
        int wavelenght = 470;
        String expectedDetect = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Blue light detected");
        }else {
            System.out.println("Test failed");
        }
    }
    public void detectGreen(){
        int wavelenght = 569;
        String expectedDetect = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Green light detected");
        }else {
            System.out.println("Test failed");
        }
}
    public void detectYellow(){
        int wavelenght = 580;
        String expectedDetect = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Yellow light detected");
        }else {
            System.out.println("Test failed");
        }
    }
    public void detectOrange(){
        int wavelenght = 605;
        String expectedDetect = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Orange light detected");
        }else {
            System.out.println("Test failed");
        }
    }
    public void detectRed(){
        int wavelenght = 700;
        String expectedDetect = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Red light detected");
        }else {
            System.out.println("Test failed");
        }
    }
    public void detectNothing(){
        int wavelenght = 200;
        String expectedDetect = "Invisible light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelenght);
        if (realResult == expectedDetect){
            System.out.println("Invisible light detected");
        }else {
            System.out.println("Test failed");
        }
    }
}
