package student_andrei_karamnov.lesson_14.homework.level_1_intern;

public class AppleLightWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
