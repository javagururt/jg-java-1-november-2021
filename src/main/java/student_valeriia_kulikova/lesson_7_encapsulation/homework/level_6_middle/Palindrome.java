package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;

import java.util.Objects;

public class Palindrome {

    public  String [] modifyText (String text) {
        String text2 = text.toLowerCase();

        text2=text2.replace(" ", "");

        String [] textArray = new String[text2.length()];
        for (int i = 0; i < text2.length(); i++) {
            textArray [i] = text2.substring(i, i+1);
        }
        return textArray;
    }

    boolean isPalindrome (String text) {

    String [] text2 = modifyText(text);

    boolean result = true;

        for (int i = 0; i < text2.length; i++) {

            result=result&&(Objects.equals(text2[i], text2[text2.length - i - 1]));

        }

    return result;
}
}
