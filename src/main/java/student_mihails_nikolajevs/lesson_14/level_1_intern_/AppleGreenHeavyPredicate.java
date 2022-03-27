package student_mihails_nikolajevs.lesson_14.level_1_intern_;

class AppleGreenHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;

    }
}
