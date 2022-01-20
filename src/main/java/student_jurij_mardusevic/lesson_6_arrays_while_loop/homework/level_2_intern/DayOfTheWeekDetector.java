package student_jurij_mardusevic.lesson_6_arrays_while_loop.homework.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeekNumber(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {return "Tuesday";}
            case 3 -> {return "Wednesday";}
            case 4 -> {return "Thursday";}
            case 5 -> {return "Friday";}
            case 6 -> {return "Saturday";}
            case 7 -> {return "Sunday";}
            default -> {return "Not correct day number";
            }
        }
    }
}
