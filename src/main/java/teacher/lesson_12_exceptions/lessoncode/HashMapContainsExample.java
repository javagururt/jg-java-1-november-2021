package teacher.lesson_12_exceptions.lessoncode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HashMapContainsExample {

    public static void main(String[] args) {
        Map<String, Integer> uqWordsToCount = new HashMap<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();

            if (word.equals("exit")) {
                break;
            }

            if (uqWordsToCount.containsKey(word)) {
                Integer counter = uqWordsToCount.get(word);
                counter++;
                uqWordsToCount.put(word, counter);
            } else {
                uqWordsToCount.put(word, 1);
            }
        }

        System.out.println(uqWordsToCount);
    }
}
