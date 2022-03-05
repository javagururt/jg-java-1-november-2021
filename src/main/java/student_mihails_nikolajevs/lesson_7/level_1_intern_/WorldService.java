package student_mihails_nikolajevs.lesson_7.level_1_intern_;

/*
Учимся разбивать задачу на подзадачи.

Дана строка с текстом.
Написать метод, который найдёт слово,
которое в тексте встречается больше всего раз.

Если несколько слов в тексте встречаются одинаково
максимальное число раз, то возвращаем то слово,
которое встречается в тексте первым.

class WordService {

   { public String findMostFrequentWord(String text)
           // напишите решение тут
           // если это необходимо то
           // смело создавайте дополнительные методы
    }
 */

import java.util.Arrays;

class WorldService {

    public static void main(String[] args) {

        System.out.println(print());
    }

    static String print(){

    String s = " H o w  M u c h is T h e Fish Fish Fish!!!";
    String word = findWords(s);
        return word;
}
        public static String findWords(String s) {
        String[] str = s.split("\\W+");

        int[] howMuch = new int[str.length];
        int maxCount = 0;
        int index = 0;

        for(int i=0; i<str.length; i++)
            for(int j=0; j<str.length; j++)
                if(str[i].equals(str[j])) howMuch[i]++;

        for(int i=0; i<howMuch.length; i++)
            if(howMuch[i]>maxCount) {
                maxCount = howMuch[i];
                index = i;
            }

        return str[index];
    }

}

