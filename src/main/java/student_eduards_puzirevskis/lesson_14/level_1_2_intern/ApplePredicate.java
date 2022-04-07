package student_eduards_puzirevskis.lesson_14.level_1_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
interface ApplePredicate {

    boolean test(Apple apple);

}
