package student_dima_talanov.lesson_6.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.print(" " + i + " ");
            i++;
        }
    }
}