package student_andrei_karamnov.lesson_11_collection.homework.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Task_1 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        //Создаем список из 10 случайных элементов на основе массива
        for (int i = 0; i < 10; i++) {
            list1.add(i, random.nextInt(100));
        }
        System.out.println("Количество элементов в списке: " + list1.size());

        System.out.print("Элементы списка:");
        printList(list1);
        list1.set(2, 27);
        list1.set(6, 42);
        System.out.println("Список после изменения 3 и 7 элемента:");
        printList(list1);
        list1.remove(2);
        list1.add(2,30);
        System.out.println("Список после удаления 3 и дбаыления 3 элемента:");
        printList(list1);

        //Создаем ссылочный список на основе первого списка
        List<Integer> list2 = new LinkedList<>(list1);
        System.out.println("Количество элементов в списке: " + list2.size());

        System.out.print("Элементы списка:");
        printList(list2);
        list2.remove(3);
        System.out.println("Элемент 4 удален и из нового списка удаляем 6й");
        printList(list2);
        list2.remove(5);
        System.out.println("Список после удаления 4 и 6 элемента:");
        printList(list2);
    }

    private static <E> void printList(List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "  + list.get(i));
        }
        System.out.println();
    }
}