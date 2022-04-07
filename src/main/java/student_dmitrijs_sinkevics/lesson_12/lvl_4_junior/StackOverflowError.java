package student_dmitrijs_sinkevics.lesson_12.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StackOverflowError {
    public static void main(String[] args) {
        StackOverflowError method = new StackOverflowError();
        method.main(args);
    }
}
