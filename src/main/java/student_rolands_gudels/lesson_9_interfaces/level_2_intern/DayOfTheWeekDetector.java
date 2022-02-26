package student_rolands_gudels.lesson_9_interfaces.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface DayOfTheWeekDetector {
    String detectDayNameSwit(int number);

    String detectDayName(int number);

    String detectDayNameArra(int number);
}
