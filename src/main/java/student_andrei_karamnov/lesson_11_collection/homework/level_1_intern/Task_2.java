package student_andrei_karamnov.lesson_11_collection.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

/*Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое?

И то и другое.

Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
*/
@CodeReview(approved = true)
class Task_2 {
    public static void main(String[] args) {
        List<Integer> primitiveList = new ArrayList<>();  //Integer is a primitive data type
        primitiveList.add(5);
        primitiveList.add(32);
        primitiveList.add(11);
        primitiveList.add(9);
        primitiveList.add(28);
        System.out.println();
        System.out.println("Список примитивных элементов, например натуральные числа:");
        System.out.println(primitiveList);
        System.out.println();
        List<String> linkedList = new ArrayList<String>();
        linkedList.add("Я помню чудное мгновенье:");
        linkedList.add("Передо мной явилась ты,");
        linkedList.add("Как мимолетное виденье,");
        linkedList.add("Как гений чистой красоты.");
        System.out.println("Список ссылочных элементов, например строк:");
        System.out.println();
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));

    }
}
