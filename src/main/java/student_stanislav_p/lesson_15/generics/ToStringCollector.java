package student_stanislav_p.lesson_15.generics;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class ToStringCollector {

    <T> List<String> toStrings(List<T> objects) {
        return objects.stream()
                .map(Objects::toString)
                .collect(Collectors.toList());
    }
}
