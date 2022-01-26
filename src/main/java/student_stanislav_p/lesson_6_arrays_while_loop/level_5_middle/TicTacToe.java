package student_stanislav_p.lesson_6_arrays_while_loop.level_5_middle;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        game.play();
    }


    // игровая логика



    public void play() {

        int gameType = gameTypeChoose();

        int moveCounter =0;

        int[][] field = createField();

        while(true) {

            moveCounter++;

            // ---------------------- move player 1 -----------------------

            movePlayer1(field, moveCounter);

            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }

            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }


            // ---------------------- move player 2 or computer -----------------------


            if (gameType == 1) {

                movePlayer2(field, moveCounter);

                if (isWin(field, 2)) {
                    System.out.println("Player 2 WIN!");
                    break;
                }
            }

            if (gameType == 2) {

                moveComputer(field, moveCounter);

                if (isWin(field, 2)) {
                    System.out.println("Computer WIN!");
                    break;
                }
            }

            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }

    }

    //-----------------------------------------------

    public int[][] createField(){
        int [][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array [j][i] = -1;
            }
        }
        return array;
    }

    //----------------------------------------------------------------------------



    int gameTypeChoose () {
        int choose;
        System.out.println("Вы будете играть с другим игроком или с компьютером?");
        System.out.println("1 - второй игрок");
        System.out.println("2 - компьютер");

        while (true) {
            choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("Выбрана игра со вторым игроком");
                return 1;
            }
            if (choose == 2) {
                System.out.println("Выбрана игра с компьютером");
                return 2;
            }
            System.out.println("Некорректный выбор!");
        }


    }

    // ------------------------------------------------


    public void movePlayer1(int [][] field, int moveCounter){

        System.out.println(" Player 1 move:");
        printFieldToConsole(field, moveCounter);

        while (true) {
            Move move0 = getNextMove();
            if (field[move0.getX()][move0.getY()] == -1) {field[move0.getX()][move0.getY()] = 0;
            break;}
            else {
                System.out.println("Такой ход был сделан. Ячейка занята. Некорректный выбор!");
            }

        }


        printFieldToConsole(field, moveCounter);


    }

    public void movePlayer2(int [][] field, int moveCounter){
        System.out.println(" Player 2 move:");

        printFieldToConsole(field, moveCounter);


        while (true) {

            Move move1 = getNextMove();
            if (field[move1.getX()][move1.getY()] == -1) {field[move1.getX()][move1.getY()] = 1;
                break;}
            else {
                System.out.println("Такой ход был сделан. Ячейка занята. Некорректный выбор!");
            }

        }

         printFieldToConsole(field, moveCounter);

    }

    public void moveComputer(int [][] field, int moveCounter){
        System.out.println(" Computer move:");

        printFieldToConsole(field, moveCounter);

        while (true) {

            Move moveAI = turnAI();

            if (field[moveAI.getX()][moveAI.getY()] == -1) {field[moveAI.getX()][moveAI.getY()] = 1;
                break;}

        }

        printFieldToConsole(field, moveCounter);


    }


    //------------------------- get move --------------------------------


    public Move getNextMove() {
        // запросите у пользователя с консоли две координаты
        // клетки куда хочет походить игрок
        // создайте экземпляр класса Move и передайте ему
        // в конструктор введённые пользователем координаты
        // верните созданный объект Move из метода.

        int x,y;

        System.out.println("Enter X  (1..3): ");
        x = scanner.nextInt() - 1;

        System.out.println("Enter Y  (1..3): ");
        y = scanner.nextInt() - 1;

        Move nextMove = new Move(x, y);

        return nextMove;

    }

    public Move turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));

        Move nextMove = new Move(x, y);

        return nextMove;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return true;
    }

//----------------------------- check position -----------------------------

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        int [] [] array = field;
        int player= playerToCheck;

        switch (player) {
            case 1:{
                if (field [0][0] == 0 && field [0][1] == 0 && field [0][2] == 0) { return true;};
                if (field [1][0] == 0 && field [1][1] == 0 && field [1][2] == 0) { return true;};
                if (field [2][0] == 0 && field [2][1] == 0 && field [2][2] == 0) { return true;};
            }

            case 2: {
                if (field [0][0] == 1 && field [0][1] == 1 && field [0][2] == 1) { return true;};
                if (field [1][0] == 1 && field [1][1] == 1 && field [1][2] == 1) { return true;};
                if (field [2][0] == 1 && field [2][1] == 1 && field [2][2] == 1) { return true;};

            }

        }

        return false;

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        int [] [] array = field;
        int player= playerToCheck;

        switch (player) {
            case 1:{
                if (field [0][0] == 0 && field [1][0] == 0 && field [2][0] == 0) { return true;};
                if (field [0][1] == 0 && field [1][1] == 0 && field [2][1] == 0) { return true;};
                if (field [0][2] == 0 && field [1][2] == 0 && field [2][2] == 0) { return true;};
            }

            case 2: {
                if (field [0][0] == 1 && field [1][0] == 1 && field [2][0] == 1) { return true;};
                if (field [0][1] == 1 && field [1][1] == 1 && field [2][1] == 1) { return true;};
                if (field [0][2] == 1 && field [1][2] == 1 && field [2][2] == 1) { return true;};

            }

        }

        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        int [] [] array = field;
        int player= playerToCheck;

        switch (player) {
            case 1:{
                if (field [0][0] == 0 && field [1][1] == 0 && field [2][2] == 0) { return true;};
                if (field [2][0] == 0 && field [1][1] == 0 && field [0][2] == 0) { return true;};
            }

            case 2: {
                if (field [0][0] == 1 && field [1][1] == 1 && field [2][2] == 1) { return true;};
                if (field [0][2] == 1 && field [1][1] == 1 && field [2][0] == 1) { return true;};

            }

        }

        return false;
    }


    public boolean isWin(int[][] field, int playerToCheck){
        int [] [] array = field;

        if (isWinPositionForHorizontals(array,playerToCheck)) {return true;}
        if (isWinPositionForVerticals(array,playerToCheck)) {return true;}
        if (isWinPositionForDiagonals(array,playerToCheck)) {return true;}

        return false;
    }

    public boolean isDraw(int[][] field){
        int [] [] array = field;

        int count=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field [i][j]==-1) {count++;}

            }
        }

            if (count>0) { return false;} else { return true;}

    }

    // -------------------------------------


    public void printFieldToConsole(int[][] field, int moveCount) {
        System.out.println(" Move # "+ moveCount);
        int currentField;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                currentField = field[i][j];
                //System.out.println("currentField  -> "+ currentField);
                System.out.print((" " +typeChar(currentField) +" "));
            }
            System.out.println();

        }
        // распечатайте поле на консоль в читаемом формате
    }

    public String typeChar(int currentFiled){

        if (currentFiled==-1) {return ".";}
        if (currentFiled==-0) {return "X";}
        if (currentFiled==1) {return "O";}

        return ".";

    }



}

//   ----------------------- class Move --------------

class  Move {

    int x,y;


    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }


    int getX() {
        return x;
    }

    int getY() {
        return y;
    }


}