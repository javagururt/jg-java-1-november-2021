package student_stanislav_p.lesson_11_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.annotations.CodeReview;

/**
 * В данной программе демострируется использование двух классов ArrayList и LinkedList.
 */

@CodeReview(approved = true)
public class Task1 {

    /**
     * Максимальное количество элементов в списках
     * */
        private static final int MAX_COUNT_ELEMENTS = 10;

        /**
         * Функция для вывода элементов в списке
         * @param list список элементов
         * */
        private static <T> void printList(List<T> list) {
            for (int index = 0; index < list.size(); index++) {
                System.out.print(" " + list.get(index));
            }
            System.out.println();
        }

        public static void main(String[] args) {
            /*Первый список*/
            List<Integer> list1 = new ArrayList<>();

            /*Построение списка*/
            for (int index = 0; index < MAX_COUNT_ELEMENTS; index++) {
                list1.add(index);
                list1.add(index);
            }

            /*Вывод количества элементов списка*/
            System.out.println("Количество элементов в первом списке: " + list1.size());

            /*Вывод содержимого списка*/
            System.out.print("Элементы первого списка:");
            printList(list1);

            /*Изменение значений 1 и 6 элемента списка*/
            list1.set(0, 55);
            list1.set(5, 46);

            /*Вывод элементов списка после изменения его элементов*/
            System.out.print("Элементы первого списка после изменения:");
            printList(list1);

            /*Конструирование нового списка на основе первого списка*/
            List<Integer> list2 = new LinkedList<>(list1);

            /*Вывод количества элементов списка*/
            System.out.println("\nКоличество элементов во втором списке: " +
                    list2.size());

            /*Вывод содержимого списка*/
            System.out.print("Элементы второго списка:");
            printList(list2);

        /*
          Удаление 2 элемента списка.
          Все элементы, стоящие справа от 2 элемента сдвигаются влево на одну позицию.
        */
            list2.remove(1);

            /*Удаление 6 элемента списка*/
            list2.remove(5);

            /*Вывод элементов списка после удаления его элементов*/
            System.out.print("Элементы второго списка после изменения:");
            printList(list2);
        }

}
