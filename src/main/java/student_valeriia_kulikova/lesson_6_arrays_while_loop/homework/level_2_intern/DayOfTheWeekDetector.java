package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek;
        switch (dayNumber) {
            case 1 :
                dayOfTheWeek = "Monday";
                break;
            case 2 :
                dayOfTheWeek = "Tuesday";
                break;
            case 3 :
                dayOfTheWeek = "Wednesday";
                break;
            case 4 :
                dayOfTheWeek = "Thursday";
                break;
            case 5 :
                dayOfTheWeek = "Friday";
                break;
            case 6 :
                dayOfTheWeek = "Saturday";
                break;
            case 7 :
                dayOfTheWeek = "Sunday";
                break;

            default :
                dayOfTheWeek = "Not correct day number";
                break;
        }
        return dayOfTheWeek;
    }

}
