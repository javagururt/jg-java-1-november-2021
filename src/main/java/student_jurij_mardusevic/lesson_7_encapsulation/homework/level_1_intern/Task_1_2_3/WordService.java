package student_jurij_mardusevic.lesson_7_encapsulation.homework.level_1_intern.Task_1_2_3;

import java.util.Scanner;

public class WordService {
    public static void main(String[] args) {

        WordService newWordService = new WordService();

        String workTextLine = newWordService.getText();
        String[] textArray = newWordService.getNewTextArray(workTextLine);
        String [] newWordArray = new String [textArray.length];

        int [] newCounterWordArray=new int [textArray.length];

        newWordService.newWordsFromTextArray(textArray,newWordArray,newCounterWordArray);

        int maxPoint = newWordService.getMaxWorldPoint(newCounterWordArray);

        System.out.println("Most popular word is - "+ newWordArray[maxPoint]);

        System.out.println("First index  is - "+ (maxPoint+1) + "  and number of repetitions is - "+newCounterWordArray[maxPoint]);

    }

    private String getText(){

        Scanner in = new Scanner(System.in);
        System.out.print("Input your text: ");

        String newText = in.nextLine();


        return newText;

    }



    public String [] getNewTextArray(String workTextLine) {


        String[] words = workTextLine.split(" ");

        return words;

    }

    void newWordsFromTextArray(String [] textArray,String [] newWordArray,int [] newCounterWordArray) {


        String [] copyTextArray = new String[textArray.length];


        for (int i = 0; i < copyTextArray.length; i++)  copyTextArray[i]=textArray[i];


        for (int i = 0; i < copyTextArray.length; i++) {
            newWordArray[i]=copyTextArray[i];
            newCounterWordArray[i]=1;

            for (int a = i+1; a <copyTextArray.length; a++) {
                if (copyTextArray[i].equals(copyTextArray[a])) {
                    copyTextArray[a]="";
                    newCounterWordArray[i]++;
                }

            }
        }

        for (int i = 0; i < newWordArray.length; i++)
            if (newWordArray[i].equals("")) newCounterWordArray[i]=0;
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