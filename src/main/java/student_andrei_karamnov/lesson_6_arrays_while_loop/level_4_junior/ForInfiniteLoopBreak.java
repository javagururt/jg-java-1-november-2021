package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*Создайте класс ForInfiniteLoopBreak и в нём продемонстрируйте
выход из бесконечного цикла реализованного при помощи цикла for.*/
@CodeReview(approved = true)
class ForInfiniteLoopBreak {
    private static volatile boolean cancelled = false;

    public static void main(String[] args) {
        // ForInfiniteLoopBreak forInfiniteLoopBreak = new ForInfiniteLoopBreak();
        // forInfiniteLoopBreak.cancel();

        for (; !cancelled;) {
            System.out.println("ForInfiniteLoop");

        }
    }
    public void cancel() {
        cancelled = true;
    }
}
