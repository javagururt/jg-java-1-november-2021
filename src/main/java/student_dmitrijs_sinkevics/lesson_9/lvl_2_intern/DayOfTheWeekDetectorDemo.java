package student_dmitrijs_sinkevics.lesson_9.lvl_2_intern;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector=dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detectorVersion=new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detectorVersion.runIfVersion();
        detectorVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detectorVersion.runSwitchVersion();
        detectorVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        detectorVersion.runArrayVersion();
    }

    public void runIfVersion(){
        System.out.println("ifVersion: "+nameOfTheDay(dayNumberInput()));
    }

    public void runSwitchVersion(){
        System.out.println("switchVersion: "+nameOfTheDay(dayNumberInput()));
    }

    public void runArrayVersion(){
        System.out.println("arrayVersion: "+nameOfTheDay(dayNumberInput()));
    }

    int dayNumberInput(){
        System.out.println("Insert any number from 1 to 7");
        Scanner keyboard=new Scanner(System.in);
        return keyboard.nextInt();
    }

    public String nameOfTheDay(int number) {
        return dayOfTheWeekDetector.detectDayName(number);

    }

    }


