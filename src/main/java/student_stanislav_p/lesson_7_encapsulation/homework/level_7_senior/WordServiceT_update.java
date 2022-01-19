package student_stanislav_p.lesson_7_encapsulation.homework.level_7_senior;

    class WordServiceT_update {

        public String findMostFrequentWord(String text) {

            String [] textArray = text.split(" ");
            int [] wordCountArray = new int[textArray.length];

            fillWordCountArray(textArray,wordCountArray);

            int max = findMaxCount(wordCountArray);

            return textArray[max];
        }

        void fillWordCountArray (String [] textArray, int [] wordCountArray) {
            int wordCounter = 0;
            for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
                for (String s : textArray) {
                    if (textArray[wordCount].equals(s)) {
                        wordCounter++;
                    }
                }
                wordCountArray[wordCount] = wordCounter;
                wordCounter = 0;
            }
        }

        int findMaxCount(int [] wordCountArray){
            int max = 0;
            for (int count =0; count < wordCountArray.length; count++) {
                if (wordCountArray[count] > max) {
                    max = count;
                }
            }
            return max;
        }

}
