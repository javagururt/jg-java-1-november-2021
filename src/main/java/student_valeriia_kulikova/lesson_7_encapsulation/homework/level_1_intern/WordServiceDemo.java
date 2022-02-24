package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_1_intern;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WordServiceDemo {
    public static void main(String[] args) {
        System.out.println("Enter your text, please:");
        WordService FindWord = new WordService();

        String myText = FindWord.writeText();
        System.out.println("My text:" + myText);

        String[] textArray = FindWord.wordArray(myText);
        System.out.println("Text array:" + Arrays.toString(textArray));

        int [] arrayCounter = FindWord.createArrayCounter(textArray);
        System.out.println("Array " + Arrays.toString(arrayCounter));

        String finalWord = FindWord.finalSearch(textArray, arrayCounter);
        System.out.println("Final word: " + finalWord);
    }
}
