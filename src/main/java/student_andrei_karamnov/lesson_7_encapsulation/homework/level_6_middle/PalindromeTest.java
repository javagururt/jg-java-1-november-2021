package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test1 = new PalindromeTest();
        test1.isThisTextPalindrome();

    }
    void isThisTextPalindrome() {
        String s1 = "Аргентина манит негра"; //true
        String s2 = "Java forever and ever"; //false
        String s3 = "ABBA"; //true
        Palindrome test1 = new Palindrome(s1);
        boolean expectedResult = true;

        passOrFail("isThisTextPalindrome TEST 1", test1.isPalindrome(s1), expectedResult);
        passOrFail("isThisTextPalindrome TEST 2", test1.isPalindrome(s2), expectedResult);
        passOrFail("isThisTextPalindrome TEST 3", test1.isPalindrome(s3), expectedResult);
    }
    void passOrFail(String testName, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println(testName + " is OK " );
        } else {
            System.out.println(testName + " FAILED " );
        }
    }

}