package student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.logic;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

class AliveNeighboursCalculation {
    @CodeReview(approved = true)
    public int aliveNeighboursCalculation(boolean[][] currentGeneration, int i, int j) {

        int[][] arrayCoord = {
                {i - 1, j - 1},
                {i - 1, j},
                {i - 1, j + 1},
                {i, j - 1},
          {i, j + 1},
          {i + 1, j - 1},
          {i + 1, j},
          {i + 1, j + 1},
  };


  int aliveNeighbours = 0;

  for (int k = 0; k < 8; k++) {


   if (isValid(currentGeneration, arrayCoord[k][0], arrayCoord[k][1])) {

    if (currentGeneration[arrayCoord[k][0]][arrayCoord[k][1]]) {
     aliveNeighbours++;
    }
   }

  }

  return aliveNeighbours;
 }

    @CodeReviewComment(comment = "нет смысла присваивать в validationResult true")
    boolean isValid(boolean[][] currentGeneration, int x, int y) {
        boolean validationResult = true;

        validationResult = validationResult && (x >= 0) && (y >= 0) && (x < currentGeneration.length) && (y < currentGeneration[0].length);

        return validationResult;
    }
}