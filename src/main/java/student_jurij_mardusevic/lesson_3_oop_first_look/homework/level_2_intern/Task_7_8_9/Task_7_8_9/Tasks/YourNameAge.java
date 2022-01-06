package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_2_intern.Task_7_8_9.Task_7_8_9.Tasks;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class YourNameAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = in.nextLine();
        System.out.print("Your age: ");
        int age = in.nextInt();
        System.out.print("Your height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }
}
