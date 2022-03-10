package student_eduards_puzirevskis.lesson_11_collections.level_1_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */
 class IntegerListDemo {
     public static void main(String[] args) {

         List<Integer> myList = new ArrayList<>();
         Random random = new Random();
         myList.add(1);
         for (int i = 0; i < 5; i++) {
            myList.add(random.nextInt(20));
         }
         myList.add(21);
         System.out.println("My Array List" + myList);
         myList.add(0, 67);
         myList.add(myList.size(), 99);
         System.out.println("My Array List after changing: " + myList);
         System.out.println("My list size is: " + myList.size());
         myList.remove(0);
         boolean listEmptiness = myList.isEmpty();
         System.out.println("Is my list empty: " + listEmptiness);
         for (int i = 0; i < myList.size(); i++) {
             System.out.println("My list " +i+ " element is: " + myList.get(i));
         }

     }

}
