package student_rolands_gudels.lesson_9_interfaces.level_2_intern;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo implements DayOfTheWeekDetector{
    String findDayOfTheWeek() {
        return null;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        dayOfTheWeekDetectorDemo.run();
    }

    void run(){
        System.out.println("Please enter integer number from 1 to 7 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Task_4.DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new Task_4.DayOfTheWeekDetectorIfVersion();
        System.out.println(dayOfTheWeekDetectorIfVersion.detectDayNameArra(number));

    }

    @Override
    public String detectDayNameSwit(int number) {
        return null;
    }

    @Override
    public String detectDayName(int number) {
        return null;
    }

    @Override
    public String detectDayNameArra(int number) {
        return null;
    }
}
