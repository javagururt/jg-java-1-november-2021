package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinder {


    Set<String> find(String text) {
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
