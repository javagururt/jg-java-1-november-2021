package teacher.lesson_11_part2.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.size());

        strings.add("A");

        System.out.println(strings.size());

        String firstElement = strings.get(0);
        System.out.println(firstElement);

        addDummyData(strings);

        System.out.println(strings);

        strings.trimToSize();


        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("----");

        strings.stream()
                .distinct()
                .forEach(System.out::println);

        //---
        String[] stringArray = new String[10];
        stringArray[0] = "A";

        System.out.println(strings);
    }


    public static void addDummyData(List<String> strings) {
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
    }
}
