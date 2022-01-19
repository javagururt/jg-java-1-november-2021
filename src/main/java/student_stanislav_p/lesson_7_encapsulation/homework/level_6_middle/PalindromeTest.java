package student_stanislav_p.lesson_7_encapsulation.homework.level_6_middle;


import java.util.Arrays;

public class PalindromeTest {

    public static void main(String[] args) {


        PalindromeTest newTest = new PalindromeTest();

        boolean realResult = true;
        boolean expectedResult = true;


        //-------- TEST 1 -------

        String testMessage = "JaVaGuru";

        char [] expectedArray1 = {'J','A','V','A','G','U','R','U'};

        Palindrome newTestMessage1 = new Palindrome(testMessage);

        realResult = newTestMessage1.isPalindrome(testMessage);

        char [] realResultArray1 = newTestMessage1.controlArray;

        boolean realResult1 = true;

        for (int i = 0; i < expectedArray1.length; i++) {
            realResult1=realResult1 && (realResultArray1[i]==expectedArray1[i]);
           // System.out.println(realResultArray1[i] + "  " + expectedArray1[i]+ "  " + realResult1);
        }

        //System.out.println(Arrays.toString(expectedArray1));
        //System.out.println(Arrays.toString(realResultArray1));


        newTest.checkTestResult("Test 1 (created char array and chek it) - ", realResult1,expectedResult);


        //-------- TEST 2 -------

        testMessage = "A man, a plan, a canal: Panama.";

        char [] expectedArray2 = {'A','M','A','N','A','P','L','A','N','A','C','A','N','A','L','P','A','N','A','M','A'};

        Palindrome newTestMessage2 = new Palindrome(testMessage);

        realResult = newTestMessage2.isPalindrome(testMessage);

        char [] realResultArray2 = newTestMessage2.controlArray;

        for (int i = 0; i < expectedArray2.length; i++) {
            realResult=realResult&&(realResultArray2[i]==expectedArray2[i]);
        }

       // System.out.println(Arrays.toString(expectedArray2));
       // System.out.println(Arrays.toString(realResultArray2));


        newTest.checkTestResult("Test 2 (check phrase as a palindrome - ", realResult,expectedResult);

        //-------- TEST 3 -------

        testMessage = "A man, o plan, a canal: Panama.";

        char [] expectedArray3 = {'A','M','A','N','A','P','L','A','N','A','C','A','N','A','L','P','A','N','A','M','A'};

        Palindrome newTestMessage3 = new Palindrome(testMessage);

        realResult = (newTestMessage3.isPalindrome(testMessage)==false);

        char [] realResultArray3 = newTestMessage3.controlArray;


        //System.out.println(Arrays.toString(expectedArray3));
        //System.out.println(Arrays.toString(realResultArray3));


        newTest.checkTestResult("Test 2 (check phrase as a palindrome - ", realResult,expectedResult);



    }

    // A man, a plan, a canal: Panama.
    //_-----------------------------------------


    void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

        if (realResult == expectedResult) {
            System.out.println(nameTest + " Control is OK");
        } else {
            System.out.println(nameTest + " Control is FAIL");
        }
    }


}
