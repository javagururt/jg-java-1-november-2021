package student_andrei_karamnov.lesson_8_inheritance.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_12 {

    abstract class LoanSystem {

        abstract boolean canReceiveLoan(Human human);

    }

    class Human {
    }

}
