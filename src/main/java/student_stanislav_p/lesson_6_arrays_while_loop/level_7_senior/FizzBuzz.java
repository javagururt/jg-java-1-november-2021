package student_stanislav_p.lesson_6_arrays_while_loop.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {

    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return (" " + number);
    }
}