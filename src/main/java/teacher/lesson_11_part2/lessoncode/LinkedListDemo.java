package teacher.lesson_11_part2.lessoncode;

import java.util.LinkedList;
import java.util.List;

class LinkedListDemo {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        System.out.println(strings.size());

        strings.add("A");

        System.out.println(strings);
    }
}
