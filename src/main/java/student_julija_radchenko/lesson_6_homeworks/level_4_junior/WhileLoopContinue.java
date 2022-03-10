package student_julija_radchenko.lesson_6_homeworks.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i < 15) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
