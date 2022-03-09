package student_valeriia_kulikova.lesson_10_junit.homework.level_3_4_junior;

public class GameOfLifeDemo {
    public static void main(String[] args) {
        GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();
        boolean [][] firstGeneration = new boolean[15][15];

        firstGeneration[5][7] = true;
        firstGeneration [5][8] = true;
        firstGeneration [5][9] = true;
        firstGeneration [6][9] = true;
        firstGeneration [7][9] = true;
        firstGeneration [8][9] = true;


        printGeneration(firstGeneration);

         for (int i = 0; i < 3; i++) {
             firstGeneration = test.calculate(firstGeneration);
             printGeneration(firstGeneration);

         }




    }

    public static void printGeneration (boolean [][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field [i][j]) {
                    System.out.print(" X ");
                } else  {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println("****************** NEXT GENERATION *********************");
    }
}
