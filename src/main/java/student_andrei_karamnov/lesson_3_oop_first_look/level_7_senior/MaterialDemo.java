package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MaterialDemo {
    public static void main(String[] args) {

        Material material = new Material("Ferum");
        String name = material.getName();
        System.out.println("Name: " + name);
        material.Ferum("Ferix-3\n","IronRussia");


    }
}
