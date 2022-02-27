package student_eduards_puzirevskis.lesson_9_interfaces.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {


    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifExample = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifExample.run();
        DayOfTheWeekDetectorDemo switchExample = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchExample.run();
        DayOfTheWeekDetectorDemo arrayExample = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        arrayExample.run();
    }

  DayOfTheWeekDetector typeOfInterface;

  public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector typeOfInterface) {
   this.typeOfInterface = typeOfInterface;
  }

  public void run() {
      int dayNumber = getDayNumber();
      String dayName = typeOfInterface.detectDayName(dayNumber);
      System.out.println(dayName);
      System.out.println();
  }

    private int getDayNumber() {
        System.out.println("Please, enter number from 1 to 7 to get name of the day");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
