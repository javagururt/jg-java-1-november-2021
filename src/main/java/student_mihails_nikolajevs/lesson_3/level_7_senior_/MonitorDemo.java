package student_mihails_nikolajevs.lesson_3.level_7_senior_;

public class MonitorDemo {

    public static void main(String[] args) {

   Monitor newMonitor1 = new Monitor("Dell U2720Q","Multimedia,Business",27,650);
   Monitor newMonitor2 = new Monitor("Samsung Odyssey G5","Multimedia,Gaming",32,400);

   newMonitor1.printMonitor();

   System.out.println("------------------------------");

   newMonitor2.printMonitor();



    }
}
