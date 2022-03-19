package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {
    Set<String> find(String text) {

        String [] finder =  text.split(" ");

        Set <String> uniqueWords = new HashSet<>();

        for (int i = 0; i < finder.length; i++) {
            uniqueWords.add(finder[i]);
        }
        return uniqueWords;
    }
}
