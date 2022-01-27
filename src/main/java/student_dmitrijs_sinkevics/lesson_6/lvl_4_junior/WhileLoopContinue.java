package student_dmitrijs_sinkevics.lesson_6.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            i--;
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
