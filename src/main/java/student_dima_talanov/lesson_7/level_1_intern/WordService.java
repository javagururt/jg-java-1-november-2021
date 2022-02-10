package student_dima_talanov.lesson_7.level_1_intern;


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WordService {

    public static void main(String[] args) {
        System.out.println("How many same words in this text?");
        System.out.println("");
        String str1 = "Holy Saint Francis, what a change is here! \n"
                + "Is Rosaline, whom thou didst love so dear, \n"
                + "So soon forsaken? young men's love then lies \n"
                + "Not truly in their hearts, but in their eyes. \n"
                + "Jesu Maria, what a deal of brine \n"
                + "Hath wash'd thy sallow cheeks for Rosaline! \n"
                + "How much salt water thrown away in waste, \n"
                + "To season love, that of it doth not taste! \n"
                + "The sun not yet thy sighs from heaven clears, \n"
                + "Thy old groans ring yet in my ancient ears; \n"
                + "Lo, here upon thy cheek the stain doth sit \n"
                + "Of an old tear that is not wash'd off yet: \n"
                + "If e'er thou wast thyself and these woes thine, \n"
                + "Thou and these woes were all for Rosaline: \n"
                + "And art thou changed? pronounce this sentence then, \n"
                + "Women may fall, when there's no strength in men. \n";

        System.out.println(mostFrequentWord(str1));
    }

    static String mostFrequentWord(String newString) {
        String[] myWords = newString.split(" ");
        int count = 0;
        String frequentWord = "";

        for (int i = myWords.length - 1; i >= 0; i--) {
            int currentWordCount = 0;
            for (String word : myWords) {
                if (myWords[i].equals(word))
                    currentWordCount++;
            }

            if (currentWordCount >= count){
                frequentWord = myWords[i];
                count = currentWordCount;
            }
        }
        return frequentWord;
    }
}

