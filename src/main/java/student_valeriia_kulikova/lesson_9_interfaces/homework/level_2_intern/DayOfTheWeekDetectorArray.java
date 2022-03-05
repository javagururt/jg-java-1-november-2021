package student_valeriia_kulikova.lesson_9_interfaces.homework.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String day = "";
        if ((number > 0) && (number < 8)) {
            String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            day = dayOfWeek[number - 1];
        } else {
            day = "Please input a valid number between 1 and 7";
        }

        return day;
    }

}
