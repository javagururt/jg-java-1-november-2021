package student_rolands_gudels._lesson_11_collections.level_1_intern;

import java.util.ArrayList;

public class Task_2 {
/*    Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
    или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.*/
    //Только ссылочные типы, любые объекты, включая сторонние классы. Строки, потоки вывода,
    // другие коллекции. Для хранения примитивных типов данных используются классы-обертки.
public static void main(String[] args) {
    ArrayList<String> list3 = new ArrayList<>(10);
    list3.add("Hello");
    list3.add(0, "Amigo");
    System.out.println(list3);
}
}
