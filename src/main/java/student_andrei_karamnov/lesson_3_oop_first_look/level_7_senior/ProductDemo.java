package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Robotic Vacuum Cleaner ");
        product.printInformation(540,35);
    }

}
