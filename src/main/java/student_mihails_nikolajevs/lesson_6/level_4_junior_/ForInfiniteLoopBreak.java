package student_mihails_nikolajevs.lesson_6.level_4_junior_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ForInfiniteLoopBreak {

    public static void main(String[] args) {

        for (int i = 1; ; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i + ";");
        }
    }
}
