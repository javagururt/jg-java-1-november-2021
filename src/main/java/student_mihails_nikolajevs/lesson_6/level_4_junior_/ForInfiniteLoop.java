package student_mihails_nikolajevs.lesson_6.level_4_junior_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ForInfiniteLoop {

    public static void main(String[] args) {

        for (int i = 1; ; i++) {

            System.out.println(i);
        }
    }
}
