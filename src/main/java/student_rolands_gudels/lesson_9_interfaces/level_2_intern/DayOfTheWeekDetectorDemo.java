package student_rolands_gudels.lesson_9_interfaces.level_2_intern;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo implements DayOfTheWeekDetector {
    String findDayOfTheWeek() {
        return null;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        dayOfTheWeekDetectorDemo.run();
    }

    void run() {
        System.out.println("Please enter integer number from 1 to 7 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Task_4.DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new Task_4.DayOfTheWeekDetectorIfVersion();
        System.out.println(dayOfTheWeekDetector.detectDayNameSwit(number));
        //Task_4.DayOfTheWeekDetectorIfVersion x = new Task_4.DayOfTheWeekDetectorIfVersion();
        //System.out.println(x.detectDayNameArra(number));
        //Task_4.DayOfTheWeekDetectorIfVersion x = new Task_4.DayOfTheWeekDetectorIfVersion();
        //System.out.println(x.detectDayName(number));
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

