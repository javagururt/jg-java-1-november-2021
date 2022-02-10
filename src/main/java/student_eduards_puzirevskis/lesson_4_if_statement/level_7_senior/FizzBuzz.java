package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

/*
// Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
 */
@CodeReview(approved = true)
class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int userNumber = fizzBuzz.getNumberFromUser();
        System.out.println(fizzBuzz.detect(userNumber));
    }

    public int getNumberFromUser() {
        System.out.println("Please, enter your number.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

     public String detect(int number) {

             if (isDividedByThree(number) && isDividedByFive(number)) {
                 return "FizzBuzz";
             }
             if (isDividedByThree(number)) {
                 return "Fizz";
             }
             if (isDividedByFive(number)) {
                 return "Buzz";
             }
                 return "" + number;
     }


     public boolean isDividedByThree(int number) {
         return number % 3 == 0;
     }

    public boolean isDividedByFive(int number) {
        return number % 5 == 0;
    }

}
