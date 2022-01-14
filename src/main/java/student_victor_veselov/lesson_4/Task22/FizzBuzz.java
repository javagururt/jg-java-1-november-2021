package student_victor_veselov.lesson_4.Task22;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {

    public String detect(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        }
        return "" + number;
    }
}