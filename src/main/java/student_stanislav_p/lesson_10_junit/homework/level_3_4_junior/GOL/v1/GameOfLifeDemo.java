package student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v1;

public class GameOfLifeDemo {
    public static void main(String[] args) {

        boolean [][] generationField = new boolean [20][20];

        for (int i = 0; i < generationField.length; i++) {
            for (int j = 0; j < generationField[0].length; j++) {

                generationField [i] [j] =false;

            }
        }


        generationField [10][10] = true;
        generationField [10][11] = true;
        generationField [10][12] = true;
        generationField[11][12] = true;

        GameOfLifeNextGenerationCalculator GOL = new GameOfLifeNextGenerationCalculator();

        System.out.println("Generation start");
        printField(generationField);


        for (int i = 0; i < 10; i++) {


            generationField = GOL.calculate(generationField);

            System.out.println("Generation #"+i);
            printField(generationField);

        }
    }

    static void printField(boolean [] [] generationField) {
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
    }
}
