package student_mihails_nikolajevs.lesson_6.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

        int dayNumber = detector.getDayNumberFromUser();

        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);

        System.out.println(dayOfTheWeek);
    }
}
