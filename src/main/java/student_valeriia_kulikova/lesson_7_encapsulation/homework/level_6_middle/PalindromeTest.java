package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;

import java.util.Arrays;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String testText1 = "А роза упала на лапу Азора";

        System.out.println("Test 1 is " + palindrome.isPalindrome(testText1));

        String testText2 = "LEvel";
        System.out.println("Test 2 is " + palindrome.isPalindrome(testText2));

        String testText3 = "sum summus mus";
        System.out.println("Test 3 is " + palindrome.isPalindrome(testText3));

        String testText4 = "sum summuuus mus";
        System.out.println("Test 4 is " + palindrome.isPalindrome(testText4));

    }
}
