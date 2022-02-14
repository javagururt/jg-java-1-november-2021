package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileLoopContinue {
    public static void main(String[] args) {

        int number = 10;
        while (number > 0) {
            number--;
            if (number % 2 == 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}
