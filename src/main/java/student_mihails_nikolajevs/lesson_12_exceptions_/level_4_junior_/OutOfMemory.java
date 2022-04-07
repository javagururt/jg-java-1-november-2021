package student_mihails_nikolajevs.lesson_12_exceptions_.level_4_junior_;
/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например, положите много объектов в список.
Память JVM не безгранична!
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class OutOfMemory {
    public static void main(String[] args) {
        IntStream.generate(() -> 1).boxed().collect(Collectors.toList()); // создаём бесконечный список.

    }

}
