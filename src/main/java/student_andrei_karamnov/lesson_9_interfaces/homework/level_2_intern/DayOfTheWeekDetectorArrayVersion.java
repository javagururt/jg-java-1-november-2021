package student_andrei_karamnov.lesson_9_interfaces.homework.level_2_intern;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number){
        String[]daysOfTheWeek = new String[8];
        daysOfTheWeek[1] = "Monday";
        daysOfTheWeek[2] = "Tuesday";
        daysOfTheWeek[3] = "Wednesday";
        daysOfTheWeek[4] = "Thursday";
        daysOfTheWeek[5] = "Friday";
        daysOfTheWeek[6] = "Saturday";
        daysOfTheWeek[7] = "Sunday";
        for (int  i= 1; i < daysOfTheWeek.length; i++) {
        }
        return daysOfTheWeek[number];
    }
}
