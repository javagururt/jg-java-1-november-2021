package student_valeriia_kulikova.lesson_4_if_statement.homework.level_5_middle;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.ColorDetectorTest(380,449, "Violet");
        lightColorDetectorTest.ColorDetectorTest(450,494, "Blue");
        lightColorDetectorTest.ColorDetectorTest(495,569, "Green");
        lightColorDetectorTest.ColorDetectorTest(570,589, "Yellow");
        lightColorDetectorTest.ColorDetectorTest(590,619, "Orange");
        lightColorDetectorTest.ColorDetectorTest(620,750, "Red");
        lightColorDetectorTest.ColorDetectorTest(379,751, "Invisible Light");
        
    }
    public void ColorDetectorTest (int waveLight1, int waveLight2, String Color) {

        LightColorDetector ColorDetector = new LightColorDetector();
        String realResult;

        realResult = ColorDetector.detect(waveLight1);
        if (realResult.equals(Color)) {
            System.out.println("Test" + Color + "- OK");
        }
        else {
            System.out.println("Test" + Color + "- FALSE");
        }
        realResult = ColorDetector.detect(waveLight2);
        if (realResult.equals(Color)) {
            System.out.println("Test" + Color + "- OK");
        }
        else {
            System.out.println("Test" + Color + "- FALSE");
        }
    }
}
