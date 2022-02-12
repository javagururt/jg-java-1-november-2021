package student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.UI;

public class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight){
        boolean [][] generationField = new boolean[fieldHeight][fieldWidth];

        for (int i = 0; i < generationField.length; i++) {
            for (int j = 0; j < generationField[0].length; j++) {

                generationField [i] [j] =false;

            }
        }


        generationField [10][10] = true;
        generationField [10][11] = true;
        generationField [10][12] = true;
        generationField[11][12] = true;


        return generationField;
    };
}
