package student_stanislav_p.lesson_14.homework.level_1_intern;


class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}