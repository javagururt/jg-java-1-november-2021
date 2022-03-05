package teacher.lesson_14.lessoncode;

import java.util.function.Function;

public class NameToUpperCaseFunction implements Function<String, String> {

    @Override
    public String apply(String name) {
        return name.toUpperCase();
    }
}
