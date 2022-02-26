package teacher.lesson_12_exceptions.lessoncode;

import java.util.List;

class ImmutableListExceptions {

    public static void main(String[] args) {
        List<String> strings = List.of("A");
        System.out.println(strings);
        strings.add("B");
        System.out.println(strings);
    }
}
