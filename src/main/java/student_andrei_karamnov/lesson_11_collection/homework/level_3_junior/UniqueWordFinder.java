package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import java.util.*;

class UniqueWordFinder {


    Set<String> find(String text){
        String newText = textUpgrade(text);
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(newText.split(" ")));
        System.out.println(uniqueWords);
        return uniqueWords;
    }

    String textUpgrade(String text){
        String text1 = text.replace(",", "");
        String text2 = text1.replace(".", "");
        String text3 = text2.replace(";", "");
        String textFinal = text3.toLowerCase(Locale.ROOT);
        return textFinal;
    }
}
