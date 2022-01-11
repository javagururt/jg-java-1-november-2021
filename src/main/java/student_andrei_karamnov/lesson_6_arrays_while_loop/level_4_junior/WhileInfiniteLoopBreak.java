package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;

import java.util.Scanner;

/*Создайте класс WhileInfiniteLoopBreak и в нём продемонстрируйте
выход из бесконечного цикла реализованного при помощи цикла while.*/
class WhileInfiniteLoopBreak {
    private static volatile boolean cancelled=false;
    public static void main(String[] args) {
        //WhileInfiniteLoopBreak whileInfiniteLoopBreak = new WhileInfiniteLoopBreak();
        //whileInfiniteLoopBreak.cancel();

        while (!cancelled){
            System.out.println("Остановитесь !!!");
        }
    }
    public void cancel() {
        cancelled = true;
    }
}
