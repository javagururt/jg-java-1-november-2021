package student_stanislav_p.lesson_7_encapsulation.level_1_intern;


import java.util.Scanner;

public class WordService {

    public static void main(String[] args) {

        WordService newWordService = new WordService();

        String workTextLine = newWordService.getText();             // ------- receive text line --------

        String[] textArray = newWordService.getNewTextArray(workTextLine);

        String [] uniqWordArray = new String [textArray.length];

        int [] uniqCounterWordArray=new int [textArray.length];


        newWordService.uniqWordsFromTextArray(textArray,uniqWordArray,uniqCounterWordArray);


        int maxPoint = newWordService.getMaxWorldPoint(uniqCounterWordArray);

        System.out.println("Most popular word is - "+ uniqWordArray[maxPoint]);

        System.out.println("First index  is - "+ (maxPoint+1) + "  and number of repetitions is - "+uniqCounterWordArray[maxPoint]);



    }

    private String getText(){

        //String newText = "aaa1 world aaa3 aaa4 aaa3 world aaa7 aaa8 aaa8 world aaa11 world aaa11 aaa14 ";

        Scanner in = new Scanner(System.in);
        System.out.print("Input your text: ");

        String newText = in.nextLine();


        return newText;

    }



    public String [] getNewTextArray(String workTextLine) {


        String[] words = workTextLine.split(" ");

        return words;


    }


    void uniqWordsFromTextArray(String [] textArray,String [] uniqWordArray,int [] uniqCounterWordArray) {


        String [] copyTextArray = new String[textArray.length];


        // ----- make array copy --------
        for (int i = 0; i < copyTextArray.length; i++)  copyTextArray[i]=textArray[i];

        // ------ find duplicate elements, put new array and delete -----------

        for (int i = 0; i < copyTextArray.length; i++) {
            uniqWordArray[i]=copyTextArray[i];
            uniqCounterWordArray[i]=1;

            for (int j = i+1; j <copyTextArray.length; j++) {

                if (copyTextArray[i].equals(copyTextArray[j])) {
                    copyTextArray[j]="";
                    uniqCounterWordArray[i]++;
                }

            }
        }

        for (int i = 0; i < uniqWordArray.length; i++) if (uniqWordArray[i].equals("")) uniqCounterWordArray[i]=0;


    }

    int getMaxWorldPoint ( int [] counterArray) {


        int maxCounter = 0;
        int point =0;

         for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i]>maxCounter) {maxCounter=counterArray[i]; point = i;}
        }

        return point;


    }

}

