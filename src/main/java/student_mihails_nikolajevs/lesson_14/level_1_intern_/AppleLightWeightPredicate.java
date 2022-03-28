package student_mihails_nikolajevs.lesson_14.level_1_intern_;

public class AppleLightWeightPredicate implements ApplePredicate {
     @Override
    public boolean test(Apple apple){
         return apple.getWeight() < 150;
     }
}
