package teacher.lesson_11_part2.lessoncode;

import java.util.Optional;
import java.util.Random;

class ExampleOptional {

    public static void main(String[] args) {
        String value = null;
        Optional<String> stringOptional = Optional.ofNullable(value);
        if (stringOptional.isEmpty()) {
            System.out.println("Empty optional");
        }

        if (stringOptional.isPresent()) {
            System.out.println("Optional present");
            String optionalValue = stringOptional.get();
            System.out.println(optionalValue.length());
        }

        stringOptional.ifPresent(System.out::println);

        Optional<String> optionalWin = getWinString();
        optionalWin.ifPresent(str -> System.out.println(str.length()));
        if (optionalWin.isPresent()) {
            System.out.println(optionalWin.get());
        }
    }


    public static Optional<String> getWinString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return Optional.of("WIN");
        } else {
            return Optional.empty();
        }
    }
}
