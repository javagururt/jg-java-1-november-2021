package student_valeriia_kulikova.lesson_9_interfaces.homework.level_2_intern;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector type;

    public DayOfTheWeekDetectorDemo (DayOfTheWeekDetector type) {
        this.type = type;
    }

    public static void main(String[] args) {
    DayOfTheWeekDetectorDemo type2;
    type2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
    type2.run();
    type2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitch());
    type2.run();
    type2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArray());
    type2.run();
    }

    public void run () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numberOfDay = scanner.nextInt();
        String dayName = type.detectDayName(numberOfDay);
        System.out.println("Your day: " + dayName);
    }

}
