package student_mihails_nikolajevs.lesson_12_exceptions_.level_4_junior_;
/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например, положите много объектов в список.

Память JVM не безгранична!
 */
import java.util.ArrayList;

public class OutOfMemoryErrorExample {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();
        int number = 5000;
        while (true){
            arrayList.add(number);
        }
    }
}
