package student_andrei_karamnov.lesson_14.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
