package student_valeriia_kulikova.lesson_12_exceptions.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StackOverflowError {
    public static void main(String[] args) {
        SOE();
    }

    public static void SOE() {
        SOE();
    }
}
