package student_mihails_nikolajevs.lesson_9.level_2_intern_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector {


    @Override
    public String detectDayName(int number) {
        String weekDay = "";
        if ((number > 0) && (number < 8)) {
            String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            weekDay = dayOfWeek[number - 1];
        } else {
            weekDay = "Please Enter Any Number from 1 to 7 ";
        }
        return weekDay;
    }
}