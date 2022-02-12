package student_stanislav_p.lesson_10_junit.homework.level_3_junior.GOL.v2.UI;

public class GameOfLifeConsoleUI {
    public void show(boolean[][] generationField){


        for (int i = 0; i < generationField.length; i++) {
            for (int j = 0; j < generationField[0].length; j++) {

                if (generationField[i][j]) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    };
}
