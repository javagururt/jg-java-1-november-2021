package student_dmitrijs_sinkevics.lesson_7.lvl_1_intern;

public class WordService {

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String victimText = "apple banana banana coconut coconut coconut";
        String victimWord = wordService.findMostFrequentWord(victimText);
        System.out.println("Most frequent word " + victimWord + " times");
    }

    public String findMostFrequentWord(String text) {
        String[] separatedText = text.split(" ");
        String maxWordCount = separatedText[0];
        int totalCount = 0;

        for (int i = 0; i < separatedText.length; i++){
            int wordCount = wordCountCalculator (separatedText, separatedText[i]);
            if (wordCount > totalCount){
                totalCount = wordCount;
                maxWordCount = separatedText[i];
            }
            if (true)
                System.out.println("Word with index: " + i + " " + "(" + separatedText[i] + ") repeated  " + wordCount + " times.");

        }
        System.out.println();
        return  "(" + maxWordCount + ")" + " repeated " + totalCount;
    }

    public int wordCountCalculator (String[] separatedText, String desiredWord){

        int times  = 0;
        for (int i = 0; i < separatedText.length; i++){
            if (separatedText[i].equals(desiredWord)){
                times++;
            }
        }
        return times;
    }
}


