package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_29;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphone firsthPhone = new Smartphone();
        firsthPhone.getBrand();
        Scanner scanner = new Scanner(System.in);
        firsthPhone.setBrand(scanner.nextLine());
        firsthPhone.getModel();
        firsthPhone.setModel(scanner.nextLine());
        firsthPhone.getCameraPixels();
        firsthPhone.setCameraPixels(scanner.nextDouble());
        firsthPhone.isNewOrUsed();
        int sostojanie = scanner.nextInt();
        if (sostojanie == 1) {
            firsthPhone.setNewOrUsed(true);
            } else {
            firsthPhone.setNewOrUsed(false);
        }
        firsthPhone.showMeWhatWeGot();

    }
}
