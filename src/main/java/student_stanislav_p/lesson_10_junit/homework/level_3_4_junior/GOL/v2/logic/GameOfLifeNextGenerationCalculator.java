package student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.logic;


public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {

        AliveNeighboursCalculation aliveNC = new AliveNeighboursCalculation();

        int aliveNeighbours = 0;

        boolean [][] newGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {

                aliveNeighbours = aliveNC.aliveNeighboursCalculation(currentGeneration, i, j);


                if ((aliveNeighbours < 2) || (aliveNeighbours > 3))  {
                    newGeneration [i] [j] = false;
                } else { newGeneration [i] [j] = true;};
            }

        }

        return newGeneration;
    }


}
