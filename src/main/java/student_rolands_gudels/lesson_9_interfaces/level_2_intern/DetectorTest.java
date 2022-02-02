package student_rolands_gudels.lesson_9_interfaces.level_2_intern;

import java.util.Objects;

public class DetectorTest {
    public static void main(String[] args) {
        DetectorTest detectorTest = new DetectorTest();
        detectorTest.ifTest();
    }

    public void ifTest() {
        Task_4.DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new Task_4.DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetectorIfVersion.detectDayName(2);
        String expected = "Tuesday";
        if (Objects.equals(actual, expected)) {
            System.out.println("If test Passed");
        } else {
            System.out.println("Tf test Failed + actual was " + actual + " but expected was " + expected);
        }
    }
}



