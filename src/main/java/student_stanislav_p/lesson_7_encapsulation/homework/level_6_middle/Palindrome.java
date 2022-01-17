package student_stanislav_p.lesson_7_encapsulation.homework.level_6_middle;

/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

    boolean isPalindrome(String text)

метод возвращает true, если строка является палиндромом,
в противном случае возвращается false.

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Регистр букв (верхний/нижний) при проверке необходимо игнорировать (LeVEl = level);

Перед реализацией метода isPalindrome() создайте класс PalindromeTest
и в нём напишите тесты. Так как реализация метода isPalindrome()
будет пуста (например всегда будет возвращать false) то тесты будут
не проходить. После того как вы написали тесты можете приступать
к реализации самого метода isPalindrome(). После того как вы закончите
все ваши тесты должны проходить. В конце обязательно напишите тест
на негативный сценарий и убедитесь в том, что он тоже работает.
 */

class Palindrome {

    String textMessage;
    char [] controlArray;

    public Palindrome(String textMessage) {
        this.textMessage = textMessage;
    }

    boolean isPalindrome(String textMessage) {
    boolean result = true;


    String changeMessage=modifyMessage(textMessage);

    fillControlArray(changeMessage);

    result = checkIsPalindrome();

    return result;

    }

    String modifyMessage(String sourceMessage){

        String str = sourceMessage.toUpperCase();


        StringBuilder resultMessage = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c) ) {
                resultMessage.append(c);
            }
        }

        return resultMessage.toString();

    }

    void fillControlArray(String  changeMessage){
        int start = 0;
        int end = changeMessage.length();
        controlArray=new char[end - start];
        changeMessage.getChars(start, end, controlArray, 0);

    }

    boolean checkIsPalindrome() {

        boolean resultOfControl=true;

        for (int i = 0; i < controlArray.length; i++) {
            resultOfControl = resultOfControl && (controlArray[i] == controlArray[controlArray.length - i-1]);
        }


        return resultOfControl;
    }

}
