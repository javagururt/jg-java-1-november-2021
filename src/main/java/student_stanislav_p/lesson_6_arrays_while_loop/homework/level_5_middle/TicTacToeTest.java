package student_stanislav_p.lesson_6_arrays_while_loop.homework.level_5_middle;


class TicTacToeTest {

    public static void main(String[] args) {

    TicTacToeTest gameTest = new TicTacToeTest();

        gameTest.createFieldTest();
        gameTest.movePlayer1Test();
        gameTest.movePlayer2Test();
        gameTest.getNextMoveTest();
        gameTest.isCellValidTest();
        gameTest.isWinPositionForHorizontalsTest();
        gameTest.isWinPositionForVerticalsTest();
        gameTest.isWinPositionForDiagonalsTest();
        gameTest.isWinTest();

        gameTest.isDrawTest();
    }

    void createFieldTest() {

        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();
        int [][] expectedArray =  {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};

        int realResult=0;
        int expectedResult = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (testArray[i][j] == expectedArray[i][j]) realResult++;
            }
        }

        checkTestResult("Test 1. 'createField'",realResult, expectedResult);

    }


    void movePlayer1Test() {
        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();
        int [][] expectedArray =  {{0,-1,-1},{-1,-1,-1},{-1,-1,-1}};

        int realResult=0;
        int expectedResult = 1;

        testArray[1][1] = 0



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (testArray[i][j] == expectedArray[i][j]) realResult++;
            }
        }

        checkTestResult("Test 2. 'movePlayer1Test'",realResult, expectedResult);

    }


    void movePlayer2Test() {
    }

    void getNextMoveTest() {
    }

    void isCellValidTest() {
    }


    void isWinPositionForHorizontalsTest() {
    }


    void isWinPositionForVerticalsTest() {
    }


    void isWinPositionForDiagonalsTest() {
    }


    void isWinTest() {
    }


    void isDrawTest() {
    }

    //--------------------------

    void checkTestResult(String nameTest, int realResult,  int expectedResult){

        if (realResult == expectedResult) {
            System.out.println(nameTest + " Control is OK");
        } else {
            System.out.println(nameTest + " Control is FAIL");
        }
    }
}