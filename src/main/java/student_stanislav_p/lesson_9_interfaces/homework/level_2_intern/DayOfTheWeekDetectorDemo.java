package student_stanislav_p.lesson_9_interfaces.homework.level_2_intern;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector typeOfInterface;


    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector typeOfInterface) {

        this.typeOfInterface = typeOfInterface;


    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo typeofImplementation;

        typeofImplementation = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());

        typeofImplementation.run();

        typeofImplementation = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());

        typeofImplementation.run();

        typeofImplementation = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());

        typeofImplementation.run();


    }

    public void run() {


        System.out.println("Demo for " + nameOfImplementation() + " method of implementation.");

        int dayNumber = getDayNumberFromUser();

        System.out.println("Your chose -> " + nameOfTheDay(dayNumber));

        System.out.println("===========================================");


    }

    public String nameOfTheDay(int dayNumber) {
        return typeOfInterface.detectDayName(dayNumber);

    }

    public String nameOfImplementation() {

        String nameOfImplement = typeOfInterface.toString();

        int pos1 = nameOfImplement.indexOf("n.") + 2;

        int pos2 = nameOfImplement.indexOf("@");

        return nameOfImplement.substring(pos1, pos2);
    }

    private int getDayNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }
}
