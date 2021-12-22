package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_30;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {

        Circle newCircle = new Circle();
        System.out.println("Hello! Tell me something about your circle.");
        newCircle.getRadius();
        Scanner scan = new Scanner(System.in);
        newCircle.setRadius(scan.nextDouble());
        newCircle.setArea(newCircle.calculateArea());
        newCircle.whatWeHave();
    }

}
