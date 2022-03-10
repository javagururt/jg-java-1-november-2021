package student_eduards_puzirevskis.lesson_11_collections.level_1_intern;


import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_2 {

     /*
     Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
      */
     public static void main(String[] args) {
          List<Integer> myArrayList = new ArrayList<>();
          int primitive = 10;
          myArrayList.add(15);
          myArrayList.add(primitive);
          System.out.println("Array List: " + myArrayList);

          List<String> myStringList = new ArrayList<>();
          myStringList.add("Example");
          String stringExample = "New Example";
          myStringList.add(stringExample);
          System.out.println("String List: " + myStringList);

     }
}
