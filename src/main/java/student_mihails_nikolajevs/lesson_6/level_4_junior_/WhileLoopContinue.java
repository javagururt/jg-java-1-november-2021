package student_mihails_nikolajevs.lesson_6.level_4_junior_;

import teacher.annotations.CodeReview;

/*
Создайте класс WhileLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла while.

Создайте класс ForLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла for.
 */
@CodeReview(approved = true)
public class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 20;
        while (i > 0) {
            i--;

            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }
    }
}
