package student_andrei_karamnov.lesson_11_collection.homework.level_1_intern;

import java.util.LinkedList;
import java.util.List;

import teacher.annotations.CodeReview;

/*Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.*/
@CodeReview(approved = true)
class Task_4 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        System.out.println();
        list1.add(12);
        list1.add(12);
        list1.add(12);
        System.out.println("List of duplicates: " + list1);
        System.out.println();

        List<String> list2 = new LinkedList<>();
        list2.add("javaguru");
        list2.add("javaguru");
        list2.add("javaguru");
        System.out.println("List of duplicates: " + list2);

        /*We can also do the same using e.g. ArrayList*/
    }


}
