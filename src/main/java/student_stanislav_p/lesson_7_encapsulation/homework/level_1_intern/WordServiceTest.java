package student_stanislav_p.lesson_7_encapsulation.homework.level_1_intern;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {

                WordServiceTest wordServiceTest = new WordServiceTest();

                wordServiceTest.getNewTextArrayTest();
                wordServiceTest.uniqWordsFromTextArrayTest();

            }

            //-----------------------------------------

            void getNewTextArrayTest() {

                WordService newService =   new WordService();

                String testText = "aaa1 world aaa3 aaa4 aaa3 world aaa7 aaa8 aaa8 world aaa11 world aaa11 aaa14 ";

                String [] expectedArray = {"aaa1","world","aaa3","aaa4","aaa3","world","aaa7","aaa8","aaa8","world","aaa11","world","aaa11","aaa14"};

                String [] realArray = newService.getNewTextArray(testText);

                boolean expectedResult = true;

                boolean realResult = true;

                if (realArray.length!=expectedArray.length) realResult=false;

                for (int i = 0; i < realArray.length; i++) {

                    if ((realArray[i].equals(expectedArray[i]))==false) realResult = realResult & false;

                }

                checkTestResult("Test 1. 'createField'",realResult, expectedResult);

                //System.out.println(Arrays.toString(realArray));
                //System.out.println(realArray.length);


                System.out.println("-------------------------------------------------------");

            }


            void uniqWordsFromTextArrayTest(){

                WordService newService =   new WordService();

                String [] testArray = {"aaa1","world","aaa3","aaa4","aaa3","world","aaa7","aaa8","aaa8","world","aaa11","world","aaa11","aaa14"};
                String [] testResultArray = new String[14];

                int [] testCountArray = new int [14];

                String [] expectedArray = {"aaa1","world","aaa3","aaa4","","","aaa7","aaa8","","","aaa11","","","aaa14"};
                int [] expectedCountArray = {1,4,2,1,0,0,1,2,0,0,2,0,0,1};

                newService.uniqWordsFromTextArray(testArray,testResultArray,testCountArray);


                boolean expectedResult = true;
                boolean realResult = true;

                if (testResultArray.length!=expectedArray.length) realResult=false;

                checkTestResult("Test 2.1 'uniqWordsFromTextArray (array length) '",realResult, expectedResult);

                for (int i = 0; i < testResultArray.length; i++) {

                    if ((testResultArray[i].equals(expectedArray[i]))==false) realResult = realResult & false;
                }

                checkTestResult("Test 2.2 'uniqWordsFromTextArray (text arrays equals) '",realResult, expectedResult);

                for (int i = 0; i < testCountArray.length; i++) {

                    if (testCountArray[i]!=expectedCountArray[i]) realResult = realResult & false;
                }

                checkTestResult("Test 2.3 'uniqWordsFromTextArray (numbers arrays equals) '",realResult, expectedResult);


            }



            //--------------------------

            void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

                if (realResult == expectedResult) {
                    System.out.println(nameTest + " Control is OK");
                } else {
                    System.out.println(nameTest + " Control is FAIL");
                }
            }
        }