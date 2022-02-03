package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_5_6;

import java.util.Arrays;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TicTacToe {

 public int[][] createField() {
  int[][] field = new int[3][3];
  for (int[] ints : field) {
   Arrays.fill(ints, -1);
  }
  return field;
 }


 public void printFieldToConsole(int[][] field) {
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

 public boolean isWin(int[][] field, int playerToCheck) {
  switch (playerToCheck) {
   case 0:
    if (isWinPositionForHorizontals(field, 0) ||
            isWinPositionForVerticals(field, 0) ||
            isWinPositionForDiagonals(field, 0)) {
     return true;
    }
   case 1:
    if (isWinPositionForHorizontals(field, 1) ||
            isWinPositionForVerticals(field, 1) ||
            isWinPositionForDiagonals(field, 1)) {
     return true;
    }
   default:
    return false;
  }
 }

 public boolean fieldIsFull(int[][] field) {
  for (int i = 0; i < field.length; i++) {
   for (int j = 0; j < field[i].length; j++) {
    if (field[i][j] == -1) {
     return false;
    }
   }
  }
  return true;
 }

 public boolean isDraw(int[][] field) {
  return fieldIsFull(field) && (!isWin(field, 0) && !isWin(field, 1));
 }

 public Move getNextMove() {
  System.out.println("Type number of raw");
  Scanner scanner = new Scanner(System.in);
  int x = scanner.nextInt();
  System.out.println("Type number of column");
  int y = scanner.nextInt();
  return new Move(x, y);
 }

 public void play() {
  int[][] field = createField();
  while(!fieldIsFull(field)) {
   printFieldToConsole(field);
   Move move0 = getNextMove();
   field[move0.getX()][move0.getY()] = 0;
   printFieldToConsole(field);
   if (isWin(field, 0)) {
    System.out.println("Player 0 WIN!");
    break;
   }
   if (isDraw(field)) {
    System.out.println("DRAW!");
    break;
   }

   printFieldToConsole(field);
   Move move1 = getNextMove();
   field[move1.getX()][move1.getY()] = 1;
   printFieldToConsole(field);
   if (isWin(field, 1)) {
    System.out.println("Player 1 WIN!");
    break;
   }
   if (isDraw(field)) {
    System.out.println("DRAW!");
    break;
   }
  }
 }


}