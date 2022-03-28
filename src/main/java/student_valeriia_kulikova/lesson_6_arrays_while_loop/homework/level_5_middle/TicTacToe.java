package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_5_middle;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public int [][]  createArray () {
        int [][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;

            }
        }
        return field;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        if (field[0][0]==playerToCheck && field[0][1]==playerToCheck && field[0][2]==playerToCheck){
            return true;
        }
        if (field[1][0]==playerToCheck && field[1][1]==playerToCheck && field[1][2]==playerToCheck){
            return true;
        }
        if (field[2][0]==playerToCheck && field[2][1]==playerToCheck && field[2][2]==playerToCheck){
            return true;
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        if (field[0][0]==playerToCheck && field[1][0]==playerToCheck && field[2][0]==playerToCheck){
            return true;
        }
        if (field[0][1]==playerToCheck && field[1][1]==playerToCheck && field[2][1]==playerToCheck){
            return true;
        }
        if (field[0][2]==playerToCheck && field[1][2]==playerToCheck && field[2][2]==playerToCheck){
            return true;
        }
        return false;
    }
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        if (field[0][0]==playerToCheck && field[1][1]==playerToCheck && field[2][2]==playerToCheck){
            return true;
        }
        if (field[2][0]==playerToCheck && field[1][1]==playerToCheck && field[0][2]==playerToCheck){
            return true;
        }
        return false;
    }
    public boolean isWinPosition(int[][] field, int playerToCheck) {

        boolean isWinForVerticals = isWinPositionForVerticals(field, playerToCheck);
        boolean isWinForHorizontals = isWinPositionForHorizontals(field, playerToCheck);
        boolean isWinForDiagonals = isWinPositionForDiagonals(field, playerToCheck);
        if (isWinForDiagonals || isWinForHorizontals || isWinForVerticals ) {
        return true;}
        else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        boolean emptyCase = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j]== -1) {
                   emptyCase = false;
                }
            }
        }

        return emptyCase;
    }
    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X coordinates: ");
        int x = sc.nextInt();
        System.out.println("Enter Y coordinates: ");
        int y = sc.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j]==-1) {
                    System.out.print("  .  ");
                }
                if (field[i][j]==0) {
                    System.out.print("  0  ");
                }
                if (field[i][j]==1) {
                    System.out.print("  X  ");
                }
            }
            System.out.println();
        }

    }

    public void play() {
        int[][] field = createArray();
        printFieldToConsole(field);
        while(true) {
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }


            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
