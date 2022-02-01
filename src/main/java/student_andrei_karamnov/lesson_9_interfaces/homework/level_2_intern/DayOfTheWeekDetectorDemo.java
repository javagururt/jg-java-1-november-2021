package student_andrei_karamnov.lesson_9_interfaces.homework.level_2_intern;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        System.out.println(demo.dayOfTheWeekDetector.detectDayName(6)); // если можно так, тогда зачем делать метод run() ?
        System.out.println(demo.run(new DayOfTheWeekDetectorSwitchVersion(), 7)); //если run делать как void то не получается его применить
        System.out.println(demo.run(new DayOfTheWeekDetectorArrayVersion(), 6));

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
    private static String run(DayOfTheWeekDetector d, int number) {
        return d.detectDayName(number);
    }

}
