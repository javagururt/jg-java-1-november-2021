package student_rolands_gudels.lesson_6_arrays_while_loop.level_6_middle;

public class Task_30 {
/*    Пошагово создаём игру крестики нолики.

    В классе TicTacToe реализуйте метод:

    public void play() {
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

    Создайте main метод и запустите игру крестики нолики:

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    Сыграйте в игру крестики нолики!*/
}
