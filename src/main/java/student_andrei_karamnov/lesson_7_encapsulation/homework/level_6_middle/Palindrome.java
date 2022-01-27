package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "если переменная не используетс, то ее лучше удалить")
class Palindrome {
    private String text;
    private char[] textToArray;

    public Palindrome(String text) {
        this.text = text;
    }

    boolean isPalindrome(String text) {
        boolean result = true;
        result = determinePalindrome(text);

        return result;
    }

    private String modifiedText(String sourceText) {
        String s1 = sourceText.toUpperCase();
        StringBuilder resultText = new StringBuilder(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (Character.isAlphabetic(c)) {
                resultText.append(c);
            }
        }
        return resultText.toString();
    }

    private String fillTextToArray(String changedText){
        int start = 0;
        int end = changedText.length();
        textToArray = new char[end - start];
        changedText.getChars(start, end, textToArray, 0);
        return changedText;
    }

    private String reversedText(String reversedChangedText) {
        StringBuffer reversedText = new StringBuffer(reversedChangedText).reverse();
        return reversedText.toString();
    }

    private boolean determinePalindrome(String text){
        boolean checkResult = true;
        String changedText = modifiedText(text);
        String changedReversedText = reversedText(changedText);
        fillTextToArray(changedText);
        fillTextToArray(changedReversedText);
        checkResult = (fillTextToArray(changedReversedText).equals(fillTextToArray(changedText)));
        return checkResult;
    }
}
