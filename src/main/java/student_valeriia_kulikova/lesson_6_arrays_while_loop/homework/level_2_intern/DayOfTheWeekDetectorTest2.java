package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest2 {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest2 test = new DayOfTheWeekDetectorTest2();
        test.shouldReturnDay(0, "Not correct day number");
        test.shouldReturnDay(1, "Monday");
        test.shouldReturnDay(2, "Tuesday");
        test.shouldReturnDay(3, "Wednesday");
        test.shouldReturnDay(4, "Thursday");
        test.shouldReturnDay(5, "Friday");
        test.shouldReturnDay(6, "Saturday");
        test.shouldReturnDay(7,"Sunday");
        test.shouldReturnDay(8,"Not correct day number");
    }


    public void shouldReturnDay(int numberOfDay, String day) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numberOfDay);
        checkTestResult(day.equals(dayOfTheWeek), day);
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
