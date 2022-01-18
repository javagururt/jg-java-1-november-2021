package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_5_middle;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeTypeOfMyGame {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {

        new TicTacToeTypeOfMyGame().game();
    }


    // конструктор: инициализация полей

    TicTacToeTypeOfMyGame() {

        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }


    // игровая логика

    void game() {

            initTable();
            while (true) {
                turnHuman();
                if (checkWin(SIGN_X)) {
                    System.out.println("YOU WIN!");
                    break;
                }
                if (isTableFull()) {
                    System.out.println("Sorry, DRAW!");
                    break;
                }
                turnAI();
                printTable();
                if (checkWin(SIGN_O)) {
                    System.out.println("AI WIN!");
                    break;
                }
                if (isTableFull()) {
                    System.out.println("Sorry, DRAW!");
                    break;
                }
            }
            System.out.println("GAME OVER.");
            printTable();
    }

    // дополнительные методы


    void initTable() {

        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = SIGN_EMPTY;
    }

    void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter X  (1..3):");
            x = scanner.nextInt() - 1;
            System.out.println("Enter Y (1..3):");
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return table[y][x] == SIGN_EMPTY;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean checkWin(char detect) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == detect && table[i][1] == detect &&
                    table[i][2] == detect) ||
                    (table[0][i] == detect && table[1][i] == detect &&
                            table[2][i] == detect))
                return true;
        if ((table[0][0] == detect && table[1][1] == detect &&
                table[2][2] == detect) ||
                (table[2][0] == detect && table[1][1] == detect &&
                        table[0][2] == detect))
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == SIGN_EMPTY)
                    return false;
        return true;
    }


}
