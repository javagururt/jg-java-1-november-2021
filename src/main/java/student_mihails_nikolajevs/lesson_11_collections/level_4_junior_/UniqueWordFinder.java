package student_mihails_nikolajevs.lesson_11_collections.level_4_junior_;

import java.util.*;

public class UniqueWordFinder {


   public String getText() {
       System.out.println(" Please Enter Your Text : ");
       Scanner in = new Scanner(System.in);
       return in.nextLine();
   }

    public Set<String> find(String text) {
       Set<String> textSet = new HashSet<>();
       String[] textArray = getTextArray(text);
        Collections.addAll(textSet, textArray);
        return textSet;
    }

     private String[] getTextArray(String text) {
       String textToLowerCAse = text.toLowerCase();
       String textWithoutPunctuationMarks = textToLowerCAse.replaceAll("\\p{Punct}","");
       return textWithoutPunctuationMarks.split(" ");
     }


}
