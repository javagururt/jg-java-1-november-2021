package student_stanislav_p.lesson_12_exceptions.homework.level_4_junior;

/*
ННапишите программу, которая вылетает с StackOverflowError.

Подсказка: Вызовите метод в рекурсии (сам себя).

Память JVM не безгранична!
 */


import java.util.ArrayList;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_26 {
    public static void main(String[] args) {
        Task_26 no = new Task_26();

        ArrayList newList = new ArrayList();
        int count=0;
        while (true) {
            no.stackOFE();
            count++;
        }
    }

    public void stackOFE() {
        stackOFE();
    }
}

/*
Exception in thread "main" java.lang.StackOverflowError
	at student_stanislav_p.lesson_12_exceptions.homework.level_4_junior.Task_26.stackOFE(Task_26.java:28)
	at student_stanislav_p.lesson_12_exceptions.homework.level_4_junior.Task_26.stackOFE(Task_26.java:28)

 */