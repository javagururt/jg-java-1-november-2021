package student_rolands_gudels.lesson4_if_statement.level_7_senior.solutions.super_task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {

    public String detect(int number){
        if (isDividedBy3(number) && isDividedBy5(number)) {
			return "FizzBuzz";
		}
		if(isDividedBy3(number)) {
			return "Fizz";
		}
		if(isDividedBy5(number)) {
			return "Buzz";
		}
		return "" + number;
    }

    private boolean isDividedBy3(int number) {
    	return number % 3 == 0;
	}

	private boolean isDividedBy5(int number) {
		return number % 5 == 0;
	}
}