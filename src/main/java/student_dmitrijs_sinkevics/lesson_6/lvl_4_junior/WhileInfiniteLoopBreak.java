package student_dmitrijs_sinkevics.lesson_6.lvl_4_junior;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "не используется break")
public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}

