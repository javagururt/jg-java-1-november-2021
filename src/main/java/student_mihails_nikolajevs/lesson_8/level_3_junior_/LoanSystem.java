package student_mihails_nikolajevs.lesson_8.level_3_junior_;

import teacher.annotations.CodeReview;

/*
Исправьте код программы так, что бы он компилировался.

abstracts class LoanSystem {

}
 */
/*
Исправьте код программы так, что бы он компилировался.
Реализовывать метод canReceiveLoan() нельзя.

public abstract class LoanSystem {

    abstract boolean canReceiveLoan(Human human);
 */
@CodeReview(approved = true)
abstract class LoanSystem {

     abstract boolean canReceiveLoan(Human human);

    private class Human {
    }
}
