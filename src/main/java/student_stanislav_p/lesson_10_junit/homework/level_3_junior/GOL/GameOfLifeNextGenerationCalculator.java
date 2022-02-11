package student_stanislav_p.lesson_10_junit.homework.level_3_junior.GOL;

import java.util.ArrayList;

class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {

        int aliveNeighbours = 0;

        boolean [][] newGeneration = currentGeneration;

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {

                aliveNeighbours = aliveNeighboursCalculation(currentGeneration, i, j);

                if (aliveNeighbours < 2) {
                    newGeneration [i] [j] = false;
                }


            }

        }




        return newGeneration; // реализацию напишем тут чуть позже
    }

    int aliveNeighboursCalculation(boolean [][] currentGeneration, int i, int j) {
        int aliveNeighbours =0;
        //List <ArrayList>

        if (((i-1)>=0) && ((j-1)>=0)) {

        }


        return 2;
    }
}
