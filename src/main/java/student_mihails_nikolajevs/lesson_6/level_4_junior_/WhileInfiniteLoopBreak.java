package student_mihails_nikolajevs.lesson_6.level_4_junior_;

import teacher.annotations.CodeReview;

/*
Создайте класс WhileInfiniteLoopBreak и в нём продемонстрируйте
выход из бесконечного цикла реализованного при помощи цикла while.

Создайте класс ForInfiniteLoopBreak и в нём продемонстрируйте
выход из бесконечного цикла реализованного при помощи цикла for.
 */
@CodeReview(approved = true)
public class WhileInfiniteLoopBreak {

    public static void main(String[] args) {

        while (true) {

            System.out.println(" INFINITY ");
        break;
        }
    }
}