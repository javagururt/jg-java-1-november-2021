package student_stanislav_p.lesson_14.homework.level_1_intern;


class AppleGreenHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
