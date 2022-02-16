package student_rolands_gudels.lesson_9_interfaces.level_2_intern;

import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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

    public void switTest() {
        Task_4.DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new Task_4.DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetectorIfVersion.detectDayNameSwit(2);
        String expected = "Tuesday";
        if (Objects.equals(actual, expected)) {
            System.out.println("Switch test Passed");
        } else {
            System.out.println("Switch test Failed + actual was " + actual + " but expected was " + expected);
        }
    }

    public void ArraTest() {
        Task_4.DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new Task_4.DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetectorIfVersion.detectDayNameArra(2);
        String expected = "Tuesday";
        if (Objects.equals(actual, expected)) {
            System.out.println("Array test Passed");
        } else {
            System.out.println("Array test Failed + actual was " + actual + " but expected was " + expected);
        }
    }
}



