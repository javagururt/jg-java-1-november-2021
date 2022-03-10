package student_rolands_gudels._lesson_11_collections.level_1_intern;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
   /* Могут ли реализации интерфейса java.util.List хранить одинаковые
    элементы (дубликаты)? Напишите код программы, который демонстрирует
    ответ на этот вопрос.*/
   public static void main(String[] args) {
       List<String> list = new ArrayList<>(5);
       list.add("first");
       list.add("first");
       System.out.println(list.size());
       System.out.println(list);
       for (String elements : list) {
           System.out.println("Element : " + elements);
       }
   }
}
