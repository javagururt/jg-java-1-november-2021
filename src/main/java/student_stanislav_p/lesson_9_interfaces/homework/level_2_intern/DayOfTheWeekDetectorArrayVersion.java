package student_stanislav_p.lesson_9_interfaces.homework.level_2_intern;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number){

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if ((number>0)&&(number<8)) {return daysOfTheWeek[number-1];}
        else {return "Please input a valid number between 1 and 7";}
    }
}
