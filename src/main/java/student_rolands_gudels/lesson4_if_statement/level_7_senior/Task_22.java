package student_rolands_gudels.lesson4_if_statement.level_7_senior;

class Task_22 {
    /*Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой: */

   static class FizzBuzz {

        public String detect(int number){
            if (isDividedByThree(number) && isDividedByFive(number)) {
                return "FizzBuzz";
            }
            if(isDividedByThree(number)) {
                return "Fizz";
            }
            if(isDividedByFive(number)) {
                return "Buzz";
            }
            return "" + number;
        }


        boolean isDividedByThree(int number) {
            return number % 3 == 0;
        }

        boolean isDividedByFive(int number) {
            return number % 5 == 0;
        }
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }
}



//Создайте класс FizzBuzzTest и напишите автоматические тесты,
//которые покрывают все возможные сценарии.*/

