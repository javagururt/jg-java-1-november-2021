package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_1_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WordService {
    public String writeText() {
        Scanner scanner = new Scanner(System.in);
        String myText = scanner.nextLine();
        return myText;
    }

    public String[] wordArray(String text) {
        String[] textArray = text.split(" ");
        return textArray;
    }

    public int findWord (String [] textArray, String word) {
        int count = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (word.equals(textArray[i])) {
                count++;
            }
        }
        return count;
    }

    public int [] createArrayCounter (String [] textArray) {
        int [] arrayCounter = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            arrayCounter[i] = findWord(textArray,textArray[i]);

        }
        return arrayCounter;
    }

    public String finalSearch (String [] textArray, int [] arrayCounter){
        String word = " ";
        int max = 0;
        for (int i = 0; i < arrayCounter.length; i++) {
            if (arrayCounter[i] > max) {
                max = arrayCounter[i];
                word = textArray[i];
            }
        }
        return word;
    }
}


