package student_andrei_karamnov.lesson_4_if_statement.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public int mul(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber) {
            return firstNumber;
        }else {
            return secondNumber;
    }
        }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;}
        else if (firstNumber < secondNumber && secondNumber > thirdNumber){
            return secondNumber;
        }else if (thirdNumber > secondNumber && thirdNumber > firstNumber){
            return thirdNumber;
        }
        return 0;
    }}



