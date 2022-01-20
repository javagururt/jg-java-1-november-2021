package student_andrei_karamnov.lesson_7_encapsulation.homework.level_1_intern;

import java.util.Arrays;

import teacher.annotations.CodeReview;

/*Учимся разбивать задачу на подзадачи.

Дана строка с текстом.
Написать метод, который найдёт слово,
которое в тексте встречается больше всего раз.

Если несколько слов в тексте встречаются одинаково
максимальное число раз, то возвращаем то слово,
которое встречается в тексте первым.*/

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words);
        int max = 0;
        int count = 1;
        String word = words[0];
        String curr = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words[i];
            }
            if (max < count) {
                max = count;
                word = words[i];
            }
        }
        return word;

    }

   /* public String[] splitAndSortText(String processedText) {
        String myText = processedText;
        String[] words = myText.split(" ");
        Arrays.sort(words);
        return words;
    }*/

}