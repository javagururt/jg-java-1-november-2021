package student_valeriia_kulikova.lesson_10_junit.homework.level_3_4_junior;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeRandomFieldGenerator {

    public boolean[][] fillingArray(boolean[][] arrayGenerator) {
        Random random = new Random();
        for (int i = 0; i < arrayGenerator.length; i++) {
            for (int j = 0; j < arrayGenerator[0].length; j++) {
                int coordinate = random.nextInt(2);
                if (coordinate == 0) {
                    arrayGenerator[i][j] = false;
                } else {
                    arrayGenerator [i][j] = true;
                }
            }

        }
        return arrayGenerator;
    }
}
