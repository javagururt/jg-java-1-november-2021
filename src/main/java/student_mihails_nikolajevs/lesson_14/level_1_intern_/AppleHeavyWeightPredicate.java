package student_mihails_nikolajevs.lesson_14.level_1_intern_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;

    }
}
