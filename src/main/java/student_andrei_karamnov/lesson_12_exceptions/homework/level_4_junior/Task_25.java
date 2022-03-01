package student_andrei_karamnov.lesson_12_exceptions.homework.level_4_junior;

/*Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична!*/

import java.util.ArrayList;
import java.util.Random;

class Task_25 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> superArray = new ArrayList<>(1000*1000*1000);
        for (int i = 0; i < superArray.size() + 1; i++) {
            superArray.add(random.nextInt());
        }
    }
}
