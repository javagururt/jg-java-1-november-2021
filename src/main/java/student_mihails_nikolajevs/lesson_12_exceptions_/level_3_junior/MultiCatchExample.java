package student_mihails_nikolajevs.lesson_12_exceptions_.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}

// At First we must catch Unchecked Exception , then Checked Exception !
// ArithmeticException is a SubClass of RuntimeException.