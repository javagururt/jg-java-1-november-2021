package student_jurij_mardusevic.lesson_6_arrays_while_loop.homework.level_2_intern;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeekNumber(dayNumber);
        System.out.println(dayOfTheWeek);
    }
}
