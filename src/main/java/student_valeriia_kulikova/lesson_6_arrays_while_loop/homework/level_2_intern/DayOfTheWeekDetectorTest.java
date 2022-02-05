package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_2_intern;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayOfTheWeek = 1;
        String result = "Monday";
        String testResult = detector.findDayOfTheWeek(dayOfTheWeek);
        if (result == testResult) {
            System.out.println("Test 1 is OK.");
        } else {
            System.out.println("Test 1 is FAIL.");
        }

        dayOfTheWeek = 0;
        result = "Not correct day number";
        testResult = detector.findDayOfTheWeek(dayOfTheWeek);
        if (result == testResult) {
            System.out.println("Test 2 is OK.");
        } else {
            System.out.println("Test 2 is FAIL.");
        }

        dayOfTheWeek = 3;
        result = "Wednesday";
        testResult = detector.findDayOfTheWeek(dayOfTheWeek);
        if (result == testResult) {
            System.out.println("Test 3 is OK.");
        } else {
            System.out.println("Test 3 is FAIL.");
        }

        dayOfTheWeek = 7;
        result = "Sunday";
        testResult = detector.findDayOfTheWeek(dayOfTheWeek);
        if (result == testResult) {
            System.out.println("Test 4 is OK.");
        } else {
            System.out.println("Test 4 is FAIL.");
        }

        dayOfTheWeek = 8;
        result = "Not correct day number";
        testResult = detector.findDayOfTheWeek(dayOfTheWeek);
        if (result == testResult) {
            System.out.println("Test 5 is OK.");
        } else {
            System.out.println("Test 5 is FAIL.");
        }
    }
}
