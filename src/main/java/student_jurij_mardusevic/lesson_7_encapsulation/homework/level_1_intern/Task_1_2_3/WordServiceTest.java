package student_jurij_mardusevic.lesson_7_encapsulation.homework.level_1_intern.Task_1_2_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.getNewTextArrayTest();
        wordServiceTest.newWordsFromTextArrayTest();

    }

    void getNewTextArrayTest() {

        WordService newService =   new WordService();

        String testText = "user1 world user3 user4 ";
        String [] expectedArray = {"user1","world","user3","user4"};
        String [] realArray = newService.getNewTextArray(testText);

        boolean expectedResult = true;
        boolean realResult = true;

        if (realArray.length!=expectedArray.length) realResult=false;
        for (int i = 0; i < realArray.length; i++) {

            if ((realArray[i].equals(expectedArray[i]))==false) realResult = realResult & false;

        }

        checkTestResult("Test 1. 'createField'",realResult, expectedResult);


        System.out.println("-");

    }


    void newWordsFromTextArrayTest(){

        WordService newService =   new WordService();

        String [] testArray = {"user1","world","user3","user4"};
        String [] testResultArray = new String[14];

        int [] testCountArray = new int [14];

        String [] expectedArray = {"user1","world","user3","user4"};
        int [] expectedCountArray = {1,4,2,1,0,0,1,2,0,0,2,0,0,1};

        newService.newWordsFromTextArray(testArray,testResultArray,testCountArray);


        boolean expectedResult = true;
        boolean realResult = true;

        if (testResultArray.length!=expectedArray.length) realResult=false;

        checkTestResult("Test 1 'newWordsFromTextArray (array length) '", realResult, expectedResult);

        for (int i = 0; i < testResultArray.length; i++) {

            if ((testResultArray[i].equals(expectedArray[i]))==false) realResult = realResult & false;
        }

        checkTestResult("Test 2 'newWordsFromTextArray (text arrays equals) '",realResult, expectedResult);

        for (int i = 0; i < testCountArray.length; i++) {

            if (testCountArray[i]!=expectedCountArray[i]) realResult = realResult & false;
        }

        checkTestResult("Test 3 'newWordsFromTextArray (numbers arrays equals) '",realResult, expectedResult);


    }


    void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

        if (realResult == expectedResult) {
            System.out.println(nameTest + "OK ");
        } else {
            System.out.println(nameTest + "FALSE ");
        }
    }

}
