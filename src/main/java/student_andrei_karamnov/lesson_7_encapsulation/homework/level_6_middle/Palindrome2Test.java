package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

class Palindrome2Test {
    public static void main(String[] args) {
        Palindrome2Test test = new Palindrome2Test();
        test.isItPalindrome();

    }
    void isItPalindrome(){
        boolean expectedResult = true;
        String firstTextForTesting = "Лёша на полке клопа нашёл "; //палиндром

        Palindrome2 palindrome = new Palindrome2(firstTextForTesting);
        passOrFail("TEST 1", palindrome.isPalindrome(firstTextForTesting), expectedResult);

        String secondTextForTesting = "Карл у Клары украл кораллы"; //не палиндром, будет фэйл
        passOrFail("TEST 2", palindrome.isPalindrome(secondTextForTesting), expectedResult);
    }


    void passOrFail(String testName, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println(testName + " is OK " );
        } else {
            System.out.println(testName + " FAILED " );
        }
    }
}
