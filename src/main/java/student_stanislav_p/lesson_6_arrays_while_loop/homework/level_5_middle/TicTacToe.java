package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_5_middle;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    String SIGN_X = "X";
    String SIGN_O = "O";
    String SIGN_EMPTY = " ";

    char[][] table;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        game.play();
    }


    // игровая логика



    public void play() {

        boolean gameType = gameTypeChoose();

        int[][] field = createField();
        while(true) {
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

    //-----------------------------------------------

    public int[][] createField(){
        int [] [] array;
        return array;
    }

    public void Move {


        void int getX() {
            int x;

            System.out.println("Enter X  (1..3):");
            x = scanner.nextInt() - 1;
        }

        void int getY() {
            int y;

            System.out.println("Enter Y  (1..3):");
            y = scanner.nextInt() - 1;
        }


    }

    public Move getNextMove() {
        // запросите у пользователя с консоли две координаты
        // клетки куда хочет походить игрок
        // создайте экземпляр класса Move и передайте ему
        // в конструктор введённые пользователем координаты
        // верните созданный объект Move из метода.


    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        int [] [] array = field;
        return true;

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        int [] [] array = field;
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        int [] [] array = field;
        return true;
    }


    public boolean isWin(int[][] field, int playerToCheck){
        int [] [] array = field;
        return true;
    }

    public boolean isDraw(int[][] field){
        int [] [] array = field;
        return true;
    }

    public void printFieldToConsole(int[][] field) {
        // распечатайте поле на консоль в читаемом формате
    }

    //----------------------------------------------------------------------------



    boolean gameTypeChoose () {
        int choose;
        System.out.println("Вы будете играть с другим игроком или с компьютером?");
        System.out.println("1 - второй игрок");
        System.out.println("2 - компьютер");

        while (true) {
            choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("Выбрана игра со вторым игроком");
                return true;
            }
            if (choose == 2) {
                System.out.println("Выбрана игра с компьютером");
                return false;
            }
            System.out.println("Некорректный выбор!");
        }


    }

}