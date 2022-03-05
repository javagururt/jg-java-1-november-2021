package student_valeriia_kulikova.lesson_8_inheritance.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructor {

    int numberX;
    int numberY;

    public DefaultConstructor() {
        numberX = 15;
        numberY = 10;
    }

    int GetSumOfNumbers () {return numberX + numberY;
    }
}
