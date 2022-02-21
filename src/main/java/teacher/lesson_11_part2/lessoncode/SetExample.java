package teacher.lesson_11_part2.lessoncode;

import java.util.HashSet;
import java.util.Set;

class SetExample {

    public static void main(String[] args) {
        Set<String> alphabet = new HashSet<>();
        alphabet.add("A");
        alphabet.add("A");
        alphabet.add("A");
        alphabet.add("D");
        alphabet.add("D");
        alphabet.add("D");
        alphabet.add("D");
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("B");
        alphabet.add("B");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("C");
        alphabet.add("C");
        alphabet.add("C");

        System.out.println(alphabet);

        System.out.println(alphabet.contains("A"));
        System.out.println(alphabet.contains("E"));

        for (String str : alphabet) {
            System.out.println(str);
        }
    }
}
