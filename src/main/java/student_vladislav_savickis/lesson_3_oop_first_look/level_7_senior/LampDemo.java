package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

class LampDemo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(false, 1000, "Sony");
        String printLampInfo = lamp.lampInfo();
        System.out.println(printLampInfo + " " + lamp.lampPower);
        lamp.switchPower(true);
        System.out.println(printLampInfo + " " + lamp.lampPower);
    }
}
