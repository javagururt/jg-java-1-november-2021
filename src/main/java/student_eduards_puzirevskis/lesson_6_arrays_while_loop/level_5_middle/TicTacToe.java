package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_5_middle;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TicTacToe {

 public int[][] createNewField() {
  int[][] field = new int[3][3];
  for (int[] ints : field) {
   Arrays.fill(ints, -1);
  }
  return field;
 }


 public void printField(int[][] field) {
  System.out.println("");
  for (int i = 0; i < field[0].length; i++) {
   System.out.print(" " + field[0][i] + " ");
  }
  System.out.println("");
  for (int i = 0; i < field[1].length; i++) {
   System.out.print(" " + field[1][i] + " ");
  }
  System.out.println("");
  for (int i = 0; i < field[2].length; i++) {
   System.out.print(" " + field[2][i] + " ");
  }
  System.out.println("");
 }

 public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
  switch (playerToCheck) {
   case 0 -> {
    if (field[0][0] == 0 && field[0][0] == field[0][1] && field[0][0] == field[0][2]) {
     return true;
    }
    if (field[1][0] == 0 && field[1][0] == field[1][1] && field[1][0] == field[1][2]) {
     return true;
    }
    return field[2][0] == 0 && field[2][0] == field[2][1] && field[2][0] == field[2][2];
   }
   case 1 -> {
    if (field[0][0] == 1 && field[0][0] == field[0][1] && field[0][0] == field[0][2]) {
     return true;
    }
    if (field[1][0] == 1 && field[1][0] == field[1][1] && field[1][0] == field[1][2]) {
     return true;
    }
    return field[2][0] == 1 && field[2][0] == field[2][1] && field[2][0] == field[2][2];
   }
   default -> {
    return false;
   }
  }
 }

 public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
  switch (playerToCheck) {
   case 0:
    if (field[0][0] == 0 && field[0][0] == field[1][0] && field[0][0] == field[2][0]) {
     return true;
    }
    if (field[0][1] == 0 && field[0][1] == field[1][1] && field[0][1] == field[2][1]) {
     return true;
    }
    if (field[0][2] == 0 && field[0][2] == field[1][2] && field[0][2] == field[2][2]) {
     return true;
    }
   case 1:
    if (field[0][0] == 1 && field[0][0] == field[1][0] && field[0][0] == field[2][0]) {
     return true;
    }
    if (field[0][1] == 1 && field[0][1] == field[1][1] && field[0][1] == field[2][1]) {
     return true;
    }
    if (field[0][2] == 1 && field[0][2] == field[1][2] && field[0][2] == field[2][2]) {
     return true;
    }
   default:
    return false;
  }

 }

 public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
  switch (playerToCheck) {
   case 0:
    if (field[0][0] == 0 && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
     return true;
    }
    if (field[0][2] == 0 && field[0][2] == field[1][1] && field[0][2] == field[2][0]) {
     return true;
    }
   case 1:
    if (field[0][0] == 1 && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
     return true;
    }
    if (field[0][2] == 1 && field[0][2] == field[1][1] && field[0][2] == field[2][0]) {
     return true;
    }
   default:
    return false;
  }

 }

 public boolean isWinPosition(int[][] field, int playerToCheck) {
  switch (playerToCheck) {
   case 0:
    if (isWinPositionForHorizontals(field, 0) || isWinPositionForVerticals(field, 0) || isWinPositionForDiagonals(field, 0)) {
     return true;
    }
   case 1:
    if (isWinPositionForHorizontals(field, 1) || isWinPositionForVerticals(field, 1) || isWinPositionForDiagonals(field, 1)) {
     return true;
    }
   default:
    return false;
  }
 }

 public boolean fieldIsFull(int[][] field) {
  for (int i = 0; i < field.length; i++) {
   for (int j = 0; j < field[i].length; j++) {
    if (field[i][j] != -1) {
     return true;
    }
   }
  }
  return false;
 }

 public boolean isDrawPosition(int[][] field) {
  if (fieldIsFull(field) && !isWinPosition(field,0) && !isWinPosition(field, 1)) {
   return true;
  }
  return false;
 }


}