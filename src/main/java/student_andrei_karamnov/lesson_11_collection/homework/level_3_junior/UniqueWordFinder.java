package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import java.util.*;

class UniqueWordFinder {


    Set<String> find(String text){
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(text.split(" +")));
        System.out.println(uniqueWords);
        return uniqueWords;
    }
}
