package student_stanislav_p.lesson_14.lessoncode;

import java.util.function.Function;

class NameToNameLengthFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length() * 100;
    }
}
