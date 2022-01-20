package student_andrei_karamnov.lesson_6_arrays_while_loop.level_5_middle;

import java.util.Random;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TicTacToe {
    final char FIELD_EMPTY = '.';
    final char FIELD_X = 'x';
    final char FIELD_O = 'o';
    char[][] field;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game1();
    }

    TicTacToe() {                   // конструктор: инициализация полей
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        field = new char[3][3];
    }

    void game1() {                   // игровая логика
        initTable();
        while (true) {
            turnHuman();            // ход человека
            if (checkWin(FIELD_X)) { // проверка: если победа человека или ничья:
                System.out.println("YOU WIN!");
                break;
            }                       //    сообщить и выйти из цикла
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();               // ход компьютера
            printTable();
            if (checkWin(FIELD_O)) { // проверка: если победа компьютера или ничья:
                System.out.println("AI WIN!");
                break;
            }                       //    сообщить и выйти из цикла
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printTable();
    }
    /*Вспомогательные методы:*/

    void initTable() {               //метод обеспечивает начальную инициализацию игровой таблицы
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                field[row][col] = FIELD_EMPTY;
            }
        }
    }

    void printTable() {              // метод, отображающий текущее состояние игровой таблицы
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(field[row][col] + " | ");
            }
            System.out.println();
        }
    }

    void turnHuman() {               // метод позволяет пользователю сделать ход
        int x, y;
        do {
            System.out.println("Enter x or y (1...3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y)); // доступность ячейки
        field[x][y] = FIELD_X;
    }

    boolean isCellValid(int x, int y) {  // метод указывает свободна или занята ячейка или если неверные координаты
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return field[x][y] == FIELD_EMPTY;
    }

    void turnAI() {                      // метод позволяющий компьютеру сделать ход на основе случайных значений координат
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        field[x][y] = FIELD_O;
    }

    boolean checkWin(char dot) {         // метод проверки победы и по крестикам и по ноликам за счет универсального параметра "dot"
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == dot && field[i][1] == dot && field[i][2] == dot) ||
                    (field[0][i] == dot && field[1][i] == dot && field[2][i] == dot)) {
                return true;
            }
            if ((field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) ||
                    (field[2][0] == dot && field[1][1] == dot && field[0][2] == dot)) {
                return true;
            }
        }
        return false;
    }

    boolean isTableFull() {             // метод проверяет заполнена или нет ячейка в игровом поле
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (field[row][col] == FIELD_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}




