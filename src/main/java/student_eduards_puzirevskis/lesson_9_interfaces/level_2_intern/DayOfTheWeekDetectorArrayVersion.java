package student_eduards_puzirevskis.lesson_9_interfaces.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {

        String[] daysOfTheWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
                "Please input a valid number between 1 and 7"
        };
        if (number > 0 && number <= 7) {
            return daysOfTheWeek[number-1];
        } else {
            return daysOfTheWeek[7];
        }
    }
}
