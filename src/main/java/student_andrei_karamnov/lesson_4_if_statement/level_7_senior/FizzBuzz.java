package student_andrei_karamnov.lesson_4_if_statement.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        return "" + number;  //не выводит на консоль строку (в чем ошибка?)
    }
}
