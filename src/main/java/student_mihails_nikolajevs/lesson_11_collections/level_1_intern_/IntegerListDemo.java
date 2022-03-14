package student_mihails_nikolajevs.lesson_11_collections.level_1_intern_;
/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */

import java.util.List;
import java.util.ArrayList;

public class IntegerListDemo {

    public static void main(String[] args) {

        List <Integer> demoList = new ArrayList<>();
        demoList.add(2);
        demoList.add(5);
        demoList.add(7);
        demoList.add(10);
        demoList.add(2,4);
        System.out.println("Your Size List : " + demoList.size());

        demoList.remove(3);
        demoList.remove(Integer.valueOf(4));

        System.out.println("Your Size List : " + demoList.size());
        System.out.println("Is Your List is Empty Now ? " + demoList.isEmpty());

            for (Integer listItem : demoList) {
                System.out.println( "Your List includes element : " + listItem);
            }
    }

}
