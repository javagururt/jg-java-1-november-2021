package student_dmitrijs_sinkevics.lesson_4.lvl_4_junior;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    } //summarise

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    } //subtraction

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    } //multiplication

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    } //division

    public boolean isEven(int number) {
        return number % 2 == 0;
    } //EvenOrOdd

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result = 0;
        if (firstNumber>=secondNumber && firstNumber>=thirdNumber){
            result = firstNumber;
        } else if (secondNumber>=firstNumber && secondNumber>=thirdNumber){
            result = secondNumber;
        } else if (thirdNumber>=firstNumber && thirdNumber>=secondNumber){
            result = thirdNumber;
        }
        return result;
    }

}
