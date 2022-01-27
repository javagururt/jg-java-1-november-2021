package student_dmitrijs_sinkevics.lesson_6.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ForInfiniteLoop {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            System.out.println(i);
        }
    }
}
