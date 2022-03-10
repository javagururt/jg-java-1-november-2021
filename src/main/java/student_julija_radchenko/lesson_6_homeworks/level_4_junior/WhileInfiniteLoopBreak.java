package student_julija_radchenko.lesson_6_homeworks.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("I'm infinity");

            i++;
            if (i > 25) {
                System.out.println("Stop");
                break;
            }
        }
    }
}
