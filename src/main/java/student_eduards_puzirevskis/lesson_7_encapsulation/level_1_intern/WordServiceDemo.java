package student_eduards_puzirevskis.lesson_7_encapsulation.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceDemo {
    public static void main(String[] args) {
        WordService demo = new WordService();
        String yourString = demo.getText();
        String letsFindIt = demo.findMostFrequentWord(yourString);
        demo.printMostFrequentWord(letsFindIt);
    }
}
