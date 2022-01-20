package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_5_middle;

import java.util.Arrays;

class TicTacToeDemo {
     public static void main(String[] args) {
         TicTacToe ticTacToe = new TicTacToe();
         int[][] field = ticTacToe.createNewField();
         ticTacToe.printField(field);
         ticTacToe.isWinPositionForHorizontals(field, 1);
         ticTacToe.isWinPositionForHorizontals(field, 2);
         ticTacToe.isWinPositionForHorizontals(field, 3);


     }
}
