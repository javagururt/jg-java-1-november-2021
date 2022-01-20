package student_julija_radchenko.lesson_6_homeworks;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();

    }

    String findDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek = null;
        if ((dayNumber < 1) || (dayNumber > 7)) {
            dayOfTheWeek = "Not correct day number";
        } else {
            switch (dayNumber) {
                case 1:
                    dayOfTheWeek = "Monday";
                    break;
                case 2:
                    dayOfTheWeek = "Tuesday";
                    break;
                case 3:
                    dayOfTheWeek = "Wednesday";
                    break;
                case 4:
                    dayOfTheWeek = "Thursday";
                    break;
                case 5:
                    dayOfTheWeek = "Friday";
                    break;
                case 6:
                    dayOfTheWeek = "Saturday";
                    break;
                case 7:
                    dayOfTheWeek = "Sunday";
                    break;
            }

        }
        return dayOfTheWeek;
    }
}
