package student_stanislav_p.lesson_10_junit.homework.level_3_junior.GOL;

public class GameOfLifeDemo {
    public static void main(String[] args) {

        boolean [][] generationField = new boolean [50][50];


        generationField [25][25] = true;
        generationField [25][26] = true;
        generationField [25][27] = true;
        generationField[26][27] = true;

        GameOfLifeNextGenerationCalculator GOL = new GameOfLifeNextGenerationCalculator();

        for (int i = 0; i < 10; i++) {

            generationField = GOL.calculate(generationField);
            printField(generationField);
        }
    }

    static void printField(boolean [] [] generationField) {
        for (int i = 0; i < generationField.length; i++) {
            for (int j = 0; j < generationField[0].length; j++) {
                System.out.print(generationField[i][j] + " ");
            }
            System.out.println();

        }
    }
}
