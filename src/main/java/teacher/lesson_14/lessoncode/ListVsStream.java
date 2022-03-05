package teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class ListVsStream {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(101));
        }

        // < 50
        // * 10
        // list

        List<Integer> newNumbers = usingList(numbers);

        System.out.println(newNumbers);

        List<Integer> newNumbers2 = usingStream(numbers);

        System.out.println(newNumbers2);
    }

    private static List<Integer> usingList(List<Integer> numbers) {
        Set<Integer> newNumbers = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            Integer integer = numbers.get(i);
            if (integer < 50) {
                Integer newInteger = integer * 10;
                newNumbers.add(newInteger);
            }
        }
        ArrayList<Integer> integers = new ArrayList<>(newNumbers);
        integers.sort(Comparator.naturalOrder());
        return integers;
    }

    private static List<Integer> usingStream(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number < 50)
                .distinct()
                .map(number -> number * 10)
                .sorted(Comparator.naturalOrder())
                .toList();
    }
}
