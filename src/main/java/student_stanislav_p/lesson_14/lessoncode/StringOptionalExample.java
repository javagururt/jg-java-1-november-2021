package student_stanislav_p.lesson_14.lessoncode;

import java.util.List;
import java.util.Optional;

class StringOptionalExample {

    public static void main(String[] args) {
        List<String> strings = List.of("A", "C", "B");
        String result = getIfPresent(strings, "D");
        if (result != null) {
            System.out.println("Value found");
        }
        Optional<String> secondResult = findValue(strings, "D");
        if (secondResult.isPresent()) {
            String foundValue = secondResult.get();
            System.out.println(foundValue);
        }
        secondResult.ifPresent(StringOptionalExample::printResult);
    }

    private static void printResult(String s) {
        System.out.println("Value found");
        System.out.println(s);
    }

    public static String getIfPresent(List<String> strings, String value) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(0);
            if (s.equals(value)) {
                return s;
            }
        }
        return null;
    }

    public static Optional<String> findValue(List<String> strings, String value) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(0);
            if (s.equals(value)) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }
}
