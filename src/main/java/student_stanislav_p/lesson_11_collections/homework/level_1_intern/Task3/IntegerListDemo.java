package student_stanislav_p.lesson_11_collections.homework.level_1_intern.Task3;
/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */


import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println("Array (list)  range is " + " " + integers.size());
        System.out.println("Now we are clearing array - ");
        integers.clear();
        System.out.println("Array (list)  range is" + " " + integers.size());
        System.out.println("Check list for empty - " + " " + integers.isEmpty());
        integers.add(1);
        integers.add(5);
        integers.add(9);
        integers.add(15);
        for(int list : integers){
            System.out.print(list + " ");
        }

    }

}
