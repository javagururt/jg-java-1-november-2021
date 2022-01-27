package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

class Palindrome2 {

private String text;

    public Palindrome2(String text) {
        this.text = text;
    }

    boolean isPalindrome(String text){
        boolean result = true;
        String changedText = modifiedText(text);
        result = checkIsPalindrome(changedText);
        return result;
    }
    private String modifiedText(String sourceText){
        String st = sourceText.toLowerCase();

        StringBuilder resultText = new StringBuilder(st.length());
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if(Character.isAlphabetic(c)){
                resultText.append(c);
            }
        }
        return resultText.toString();
    }
    private boolean checkIsPalindrome(String text){
        if(text.length() == 1 || text.length() == 0)
            return true; //base
        if(text.charAt(0) == text.charAt(text.length() - 1))
            return isPalindrome(text.substring(1, text.length() - 1)); //recursive method
        return false;
    }
    }

