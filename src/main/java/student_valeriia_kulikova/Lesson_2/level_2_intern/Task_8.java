package student_valeriia_kulikova.Lesson_2.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_8 {
    public static void main(String [] args) {
        System.out.println("write your NAME");
        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        System.out.println("Hello " + name1);

    }
}
