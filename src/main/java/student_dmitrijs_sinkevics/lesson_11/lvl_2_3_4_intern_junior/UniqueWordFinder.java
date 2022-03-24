package student_dmitrijs_sinkevics.lesson_11.lvl_2_3_4_intern_junior;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text){
        Set<String> uniqueWordList = new HashSet<>(List.of(text.split(" ")));
        return uniqueWordList;
    }
}
