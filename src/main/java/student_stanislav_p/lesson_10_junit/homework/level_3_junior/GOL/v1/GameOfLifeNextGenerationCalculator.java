package student_stanislav_p.lesson_10_junit.homework.level_3_junior.GOL.v1;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {

        int aliveNeighbours = 0;

        boolean [][] newGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {

                aliveNeighbours = aliveNeighboursCalculation(currentGeneration, i, j);


                if ((aliveNeighbours < 2) || (aliveNeighbours > 3))  {
                    newGeneration [i] [j] = false;
                } else { newGeneration [i] [j] = true;};
            }

        }

        return newGeneration;
    }

    int aliveNeighboursCalculation(boolean [][] currentGeneration, int i, int j) {

        int [] [] arrayCoord = {
                {i-1,j-1},
                {i-1,j},
                {i-1,j+1},
                {i,j-1},
                {i,j+1},
                {i+1,j-1},
                {i+1,j},
                {i+1,j+1},
        };


        int aliveNeighbours =0;

        for (int k = 0; k < 8; k++) {


           if (isValid(currentGeneration,arrayCoord[k][0],arrayCoord[k][1])) {

              if (currentGeneration[arrayCoord[k][0]][arrayCoord[k][1]]) {
                   aliveNeighbours++;}
           }

        }

        return aliveNeighbours;
    }

    boolean isValid (boolean [][] currentGeneration, int x, int y){
        boolean validationResult = true;

        validationResult= validationResult&&(x>=0)&&(y>=0)&&(x<currentGeneration.length)&&(y<currentGeneration[0].length);

        return validationResult;
    }
}
