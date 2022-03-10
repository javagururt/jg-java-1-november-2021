package student_valeriia_kulikova.lesson_10_junit.homework.level_3_4_junior;

public class GameOfLifeNextGenerationCalculator {


    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean [][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        int count;
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {

             count=0;
             if (i-1 >= 0 && j-1 >= 0){
             if (currentGeneration[i-1][j-1]) {count++;}}

             if (j-1 >= 0){
             if (currentGeneration[i][j-1]) {count++;}}

             if (i+1 < currentGeneration.length && j-1 >= 0) {
             if (currentGeneration[i+1][j-1]) {count++;}}

             if (i+1 < currentGeneration.length){
             if (currentGeneration[i+1][j]) {count++;}}

             if (i+1 < currentGeneration.length && j+1 < currentGeneration[0].length){
             if (currentGeneration[i+1][j+1]) {count++;}}

             if (j+1 < currentGeneration[0].length) {
             if (currentGeneration[i][j+1]) {count++;}}

             if (i-1 >= 0 && j+1 < currentGeneration[0].length) {
             if (currentGeneration[i-1][j+1]) {count++;}}

             if (i-1 >= 0) {
             if (currentGeneration[i-1][j]) {count++;}}

             if (currentGeneration[i][j] == true &&  count < 2 ) {
                 nextGeneration[i][j] = false;
             }
             if (currentGeneration[i][j] == true &&  count ==2 ) {
                 nextGeneration[i][j] = true;
             }
                if (currentGeneration[i][j] == true &&  count ==3) {
                    nextGeneration[i][j] = true;}

              if (currentGeneration[i][j] == true && count > 3) {
                  nextGeneration [i][j] = false;
              }
              if (currentGeneration[i][j] == false && count > 3) {
                  nextGeneration [i][j] = true;
              }

            }



        }
        return nextGeneration;
    }




}
