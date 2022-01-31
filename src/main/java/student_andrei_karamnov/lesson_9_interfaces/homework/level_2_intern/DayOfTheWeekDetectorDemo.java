package student_andrei_karamnov.lesson_9_interfaces.homework.level_2_intern;

import java.util.Objects;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(Objects::toString);
        demo.run(4); // Как в конструктор можно подать любую из трёх имплементаций интерфейса ???


        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        System.out.println(detectorIfVersion.detectDayName(4));
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        System.out.println(dayOfTheWeekDetectorSwitchVersion.detectDayName(4));
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        System.out.println(dayOfTheWeekDetectorArrayVersion.detectDayName(4));
    }

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day) {
    this.dayOfTheWeekDetector = day;
    }

    public void run(int number){
        dayOfTheWeekDetector.detectDayName(number);
    }
}
