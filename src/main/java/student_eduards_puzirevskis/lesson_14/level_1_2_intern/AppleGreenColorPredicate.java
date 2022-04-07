package student_eduards_puzirevskis.lesson_14.level_1_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
         return "red".equals(apple.getColor());
     }
 }

class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}

class AppleGreenHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}

