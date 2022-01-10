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
        new TicTacToe().game();
    }


    // игровая логика

    void game() {

        boolean gameType = gameTypeChoose();



    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        int [] [] array = field;
        return true;

    }

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