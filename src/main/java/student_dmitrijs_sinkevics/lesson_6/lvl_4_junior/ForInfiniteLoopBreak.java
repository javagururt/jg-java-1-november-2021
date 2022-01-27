package student_dmitrijs_sinkevics.lesson_6.lvl_4_junior;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "не используется break")
public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
