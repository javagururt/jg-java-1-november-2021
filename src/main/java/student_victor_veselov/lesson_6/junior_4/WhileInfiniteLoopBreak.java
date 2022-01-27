package student_victor_veselov.lesson_6.junior_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        while (true) {
            System.out.println("asd");
            break;
        }
    }
}
