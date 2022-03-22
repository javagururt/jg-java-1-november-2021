package student_dmitrijs_sinkevics.lesson_11.lvl_1_intern;
import java.util.ArrayList;
import java.util.List;

//Что может хранить java.util.List: Только ссылочные типы, любые объекты, включая сторонние классы. Строки, потоки вывода, другие коллекции.
// Для хранения примитивных типов данных используются классы-обертки.

public class Task_2 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Hello");
        myArrayList.add(" World");
        myArrayList.add("!");

        for (int i = 0; i < myArrayList.size(); i++)
            System.out.print(myArrayList.get(i));

    }
}
