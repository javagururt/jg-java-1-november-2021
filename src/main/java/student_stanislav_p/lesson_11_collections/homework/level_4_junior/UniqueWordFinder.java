package student_stanislav_p.lesson_11_collections.homework.level_4_junior;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text){
        HashSet<String > myHashSet = new HashSet<String>();

        String newText = modifyText(text);

        String [] textArray = newText.split(" ");

        for (int i = 0; i < textArray.length; i++) {

            myHashSet.add(textArray[i]);

        }

        return myHashSet;
    }

    String modifyText (String text){

        String newtext = text.replace(",","");
        String returntext = newtext.replace(".","");

        return returntext;


    }
}
