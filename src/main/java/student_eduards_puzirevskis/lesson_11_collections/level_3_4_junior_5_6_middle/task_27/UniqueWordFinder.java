package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.task_27;

//import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinder {

    public String getText() {
        System.out.println("Please, write your text: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public Set<String> find(String text) {
        Set<String> textSet = new HashSet<>();
        String[] textArray = getTextArray(text);
        Collections.addAll(textSet, textArray);
        return textSet;
    }

    //@NotNull
    private String[] getTextArray(String text) {
        String textToLowerCase = text.toLowerCase();
        String textWithoutPunctuationMarks = textToLowerCase.replaceAll("\\p{Punct}", "");
        return textWithoutPunctuationMarks.split(" ");
    }


}
