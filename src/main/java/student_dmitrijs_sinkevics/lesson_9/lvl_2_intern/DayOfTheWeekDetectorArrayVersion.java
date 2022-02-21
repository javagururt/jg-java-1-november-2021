package student_dmitrijs_sinkevics.lesson_9.lvl_2_intern;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        String[] dayOfTheWeek = new String[8];
        dayOfTheWeek[1]="Monday";
        dayOfTheWeek[2]="Tuesday";
        dayOfTheWeek[3]="Wednesday";
        dayOfTheWeek[4]="Thursday";
        dayOfTheWeek[5]="Friday";
        dayOfTheWeek[6]="Saturday";
        dayOfTheWeek[7]="Sunday";
            return dayOfTheWeek[number];

    }
}
