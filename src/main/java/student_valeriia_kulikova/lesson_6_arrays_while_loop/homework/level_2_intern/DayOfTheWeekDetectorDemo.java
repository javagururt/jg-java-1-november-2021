package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_2_intern;

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

