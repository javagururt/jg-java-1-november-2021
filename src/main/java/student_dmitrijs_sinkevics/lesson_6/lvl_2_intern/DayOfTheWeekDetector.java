package student_dmitrijs_sinkevics.lesson_6.lvl_2_intern;


import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7: ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        if (dayNumber == 1)
            return "Monday";
        if (dayNumber == 2)
            return "Tuesday";
        if (dayNumber==3)
            return "Wednesday";
        if (dayNumber==4)
            return "Thursday";
        if (dayNumber==5)
            return "Friday";
        if (dayNumber==6)
            return "Saturday";
        if (dayNumber==7)
            return "Sunday";
        else
            return "Not correct day number";

    }

}
