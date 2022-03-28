package student_mihails_nikolajevs.lesson_10_junit.level_3_junior;

public class GameOfLifeNextGenerationCalculator {


    
    private boolean[][] board;
    private int maxRow, maxCol;

    public GameOfLifeNextGenerationCalculator(boolean[][] board) {
        if (board != null)
            this.board = board;
        else
            this.board = new boolean[1][1];

        this.maxRow = this.board.length;
        this.maxCol = this.board[0].length;
    }

    public void calculateNextGeneration() {
        boolean[][] nextBoard = new boolean[maxRow][maxCol];

        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                nextBoard[row][col] = nextState(row, col);
            }
        }


        board = nextBoard;
    }

    public void print() {
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                if (isAlive(row, col))
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }

    public void setAlive(int row, int col, boolean isAlive) {
        if (inBounds(row, col))
            board[row][col] = isAlive;
    }

    public boolean isAlive(int row, int col) {
        if (inBounds(row, col))
            return board[row][col];
        else
            return false;
    }

    private boolean nextState(int rowPos, int colPos) {
        int alive = 0;

        for (int row = rowPos - 1; row <= rowPos + 1; row++) {
            for (int col = colPos - 1; col <= colPos + 1; col++) {
                if (!inBounds(row, col) || (row == rowPos && col == colPos))
                    continue;

                if (isAlive(row, col))
                    alive++;
            }
        }

        if (alive == 3)
            return true;
        else if (isAlive(rowPos, colPos) && alive == 2)
            return true;
        else
            return false;
    }

    private boolean inBounds(int row, int col) {
        if (row < 0 || row >= maxRow || col < 0 || col >= maxCol)
            return false;
        else
            return true;
    }
}
