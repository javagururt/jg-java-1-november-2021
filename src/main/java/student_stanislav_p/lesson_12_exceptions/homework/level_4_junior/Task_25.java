package student_stanislav_p.lesson_12_exceptions.homework.level_4_junior;

/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична!
 */


import java.util.ArrayList;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_25 {
    public static void main(String[] args) {
        Task_25 no = new Task_25();

        ArrayList newList = new ArrayList();
        int count=0;
        while (true) {
            newList.add(no.newStringArray());
            count++;
        }
    }

    String [] newStringArray(){

        String [] newArray = new String[1_000_000];

        for (int i = 0; i < 1_000_000; i++) {
            newArray [i] = "kjafhglkajfhglafhglakjhgnla";
        }

        return newArray;
    }
}

/*
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at student_stanislav_p.lesson_12_exceptions.homework.level_4_junior.Task_25.newStringArray(Task_25.java:30)
	at student_stanislav_p.lesson_12_exceptions.homework.level_4_junior.Task_25.main(Task_25.java:23)

 */