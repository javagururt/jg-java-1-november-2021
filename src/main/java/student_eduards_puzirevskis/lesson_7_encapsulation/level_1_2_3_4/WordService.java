package student_eduards_puzirevskis.lesson_7_encapsulation.level_1_2_3_4;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String getText() {
        System.out.println("Please, write your text: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] convertTextInToArray(String text) {
        String textWithoutPunctuationMarks = text.replaceAll("\\p{Punct}", "");
        return textWithoutPunctuationMarks.split(" ");
    }

    public int findIndexForMostFrequentWord(int[] counter) {
        int maxCount = 0;
        int indexOfMostFrequentWord = 0;
        for(int i = 0; i <  counter.length; i++)
            if(counter[i]> maxCount) {
                maxCount = counter[i];
                indexOfMostFrequentWord = i;
            }
        return indexOfMostFrequentWord;
    }

    public void findEqualWordsInText(String[] yourTextInArray, int[] counter) {
        for(int i = 0; i < yourTextInArray.length; i++)
            for (String s : yourTextInArray)
                if (yourTextInArray[i].equals(s))  counter[i]++;
    }

    public int[] createArrayToCount(String[] yourTextInArray) {
        return new int[yourTextInArray.length];
    }

    public String findMostFrequentWord(String yourText) {
        String[] yourTextInArray = convertTextInToArray(yourText);
        int[] counter = createArrayToCount(yourTextInArray);
        findEqualWordsInText(yourTextInArray, counter);
        int indexOfMostFrequentWord = findIndexForMostFrequentWord(counter);
        return yourTextInArray[indexOfMostFrequentWord];
    }

    public void printMostFrequentWord(String word) {
        System.out.println("Nice. The most frequent word in your text is: " + word);
    }

}

