package student_mihails_nikolajevs.lesson_12_exceptions_.level_4_junior_;
/*
Напишите программу, которая вылетает с StackOverflowError.
Подсказка: Вызовите метод в рекурсии (сам себя).
Память JVM не безгранична!
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StackOverFlowExample {

    public static void main(String[] args) {
        System.out.println(add5(1));
    }

    public static int add5(int a) {
        return add5(a) + 5;             // add5(a) будет называть себя, а затем снова называть себя и т. д.
    }
}

// StackOverflowError в основном - это когда вы пытаетесь сделать что-то, что, скорее всего,
// называет себя , и продолжается бесконечно (или пока оно не даст StackOverflowError).