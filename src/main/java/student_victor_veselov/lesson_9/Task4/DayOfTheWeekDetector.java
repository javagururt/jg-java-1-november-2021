package student_victor_veselov.lesson_9.Task4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface DayOfTheWeekDetector {
    String detectDayName(int number);

    String detectByDayName(int dayNumbers);

}
