package student_stanislav_p.lesson_6_arrays_while_loop.level_2_intern;

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

        String dayName = " ";

        switch (dayNumber) {
            case 1 :
                dayName = ("Monday");
                break;
            case 2 :
                dayName = ("Tuesday");
                break;
            case 3 :
                dayName = ("Wednesday");
                break;
            case 4 :
                dayName =  ("Thursday");
                break;
            case 5 :
                dayName =  ("Friday");
                break;
            case 6 :
                dayName = ("Saturday");
                break;
            case 7 :
                dayName = ("Sunday");
                break;
            default :
                dayName =  ("Not correct day number");
                break;
        }
        return dayName;

    }

}
