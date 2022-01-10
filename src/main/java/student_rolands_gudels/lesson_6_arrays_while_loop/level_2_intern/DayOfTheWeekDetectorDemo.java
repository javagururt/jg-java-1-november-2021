package student_rolands_gudels.lesson_6_arrays_while_loop.level_2_intern;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
       int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }
    }
class DayOfTheWeekDetector {
       public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public static String findDayOfTheWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                return ("Monday");
            }
            case 2 -> {
                return ("Tuesday");
            }
            case 3 -> {
                return ("Wednesday");
            }
            case 4 -> {
                return ("Thursday");
            }
            case 5 -> {
                return ("Friday");
            }
            case 6 -> {
                return ("Saturday");
            }
            case 7 -> {
                return ("Sunday");
            }
            default -> {
                return ("Not correct day number");
            }
        }
    }

}
