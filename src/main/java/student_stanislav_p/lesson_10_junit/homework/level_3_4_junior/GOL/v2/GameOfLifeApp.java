package student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2;

import student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.UI.GameOfLife;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeApp {
    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.run();
    }
}
