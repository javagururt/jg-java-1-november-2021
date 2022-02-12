package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
        }
    }
}
