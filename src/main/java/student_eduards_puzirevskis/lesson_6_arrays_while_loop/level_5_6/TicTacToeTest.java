package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_5_6;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TicTacToeTest {
    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.shouldDetectHorizontalWinPositionFirst();
        test.shouldDetectHorizontalWinPositionSecond();
        test.shouldNotDetectHorizontalWinPositionForAnyPlayer();
        test.shouldDetectVerticalWinPositionFirst();
        test.shouldDetectVerticalWinPositionSecond();
        test.shouldNotDetectVerticalWinPositionForAnyPlayer();
        test.shouldDetectDiagonalWinPositionFirst();
        test.shouldDetectDiagonalWinPositionSecond();
        test.shouldNotDetectDiagonalWinPositionForAnyPlayer();
        test.shouldDetectWinPositionForFirstPlayer();
        test.shouldDetectWinPositionForSecondPlayer();
        test.shouldNotDetectWinPositionForAnyPlayer();
        test.shouldDetectDraw();
        test.shouldCreateNewField();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASSED!");
        } else {
            System.out.println(testName + " = FAILURE!");
        }
    }

    private void shouldDetectHorizontalWinPositionFirst() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,0,0},{-1,-1,1},{1,1,-1}};
        int[][] newFieldSecond = {{1,-1,0},{0,0,0},{1,1,-1}};
        int[][] newFieldThird = {{1,-1,1},{-1,-1,1},{0,0,0}};
        boolean realResultFirst = newGame.isWinPositionForHorizontals(newFieldFirst, 0);
        boolean realResultSecond = newGame.isWinPositionForHorizontals(newFieldSecond, 0);
        boolean realResultThird = newGame.isWinPositionForHorizontals(newFieldThird, 0);
        checkTestResult(realResultFirst, "Should Detect Horizontal Win Position First Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Horizontal Win Position First Player Test P.II.");
        checkTestResult(realResultThird, "Should Detect Horizontal Win Position First Player Test P.III.");
    }

    private void shouldDetectHorizontalWinPositionSecond() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{1,1,1},{-1,-1,1},{1,1,-1}};
        int[][] newFieldSecond = {{1,-1,0},{1,1,1},{1,1,-1}};
        int[][] newFieldThird = {{1,-1,1},{-1,-1,1},{1,1,1}};
        boolean realResultFirst = newGame.isWinPositionForHorizontals(newFieldFirst, 1);
        boolean realResultSecond = newGame.isWinPositionForHorizontals(newFieldSecond, 1);
        boolean realResultThird = newGame.isWinPositionForHorizontals(newFieldThird, 1);
        checkTestResult(realResultFirst, "Should Detect Horizontal Win Position Second Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Horizontal Win Position Second Player Test P.II.");
        checkTestResult(realResultThird, "Should Detect Horizontal Win Position Second Player Test P.III.");
    }

    private void shouldNotDetectHorizontalWinPositionForAnyPlayer() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,1,1},{-1,-1,1},{1,1,-1}};
        int[][] newFieldSecond = {{1,-1,0},{-1,1,1},{1,1,-1}};
        int[][] newFieldThird = {{1,-1,1},{-1,-1,1},{-1,1,1}};
        boolean realResultFirst = newGame.isWinPositionForHorizontals(newFieldFirst, 0);
        boolean realResultSecond = newGame.isWinPositionForHorizontals(newFieldSecond, 1);
        boolean realResultThird = newGame.isWinPositionForHorizontals(newFieldThird, 2);
        checkTestResult(!realResultFirst, "Should Not Detect Horizontal Win Position For Any Player Test P.I.");
        checkTestResult(!realResultSecond, "Should Not Detect Horizontal Win Position For Any Player Test P.II.");
        checkTestResult(!realResultThird, "Should Not Detect Horizontal Win Position For Any Player Test P.III.");
    }

    private void shouldDetectVerticalWinPositionFirst() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,1,0},{0,-1,1},{0,1,-1}};
        int[][] newFieldSecond = {{1,0,0},{1,0,0},{-1,0,-1}};
        int[][] newFieldThird = {{1,-1,0},{-1,-1,0},{0,1,0}};
        boolean realResultFirst = newGame.isWinPositionForVerticals(newFieldFirst, 0);
        boolean realResultSecond = newGame.isWinPositionForVerticals(newFieldSecond, 0);
        boolean realResultThird = newGame.isWinPositionForVerticals(newFieldThird, 0);
        checkTestResult(realResultFirst, "Should Detect Vertical Win Position First Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Vertical Win Position First Player Test P.II.");
        checkTestResult(realResultThird, "Should Detect Vertical Win Position First Player Test P.III.");
    }

    private void shouldDetectVerticalWinPositionSecond() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{1,1,0},{1,-1,1},{1,1,-1}};
        int[][] newFieldSecond = {{1,1,0},{1,1,0},{-1,1,-1}};
        int[][] newFieldThird = {{1,-1,1},{-1,-1,1},{0,1,1}};
        boolean realResultFirst = newGame.isWinPositionForVerticals(newFieldFirst, 1);
        boolean realResultSecond = newGame.isWinPositionForVerticals(newFieldSecond, 1);
        boolean realResultThird = newGame.isWinPositionForVerticals(newFieldThird, 1);
        checkTestResult(realResultFirst, "Should Detect Vertical Win Position Second Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Vertical Win Position Second Player Test P.II.");
        checkTestResult(realResultThird, "Should Detect Vertical Win Position Second Player Test P.III.");
    }

    private void shouldNotDetectVerticalWinPositionForAnyPlayer() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,1,1},{-1,-1,1},{1,1,-1}};
        int[][] newFieldSecond = {{1,-1,0},{-1,1,1},{1,1,-1}};
        int[][] newFieldThird = {{1,-1,1},{-1,-1,1},{-1,1,0}};
        boolean realResultFirst = newGame.isWinPositionForVerticals(newFieldFirst, 0);
        boolean realResultSecond = newGame.isWinPositionForVerticals(newFieldSecond, 1);
        boolean realResultThird = newGame.isWinPositionForVerticals(newFieldThird, 2);
        checkTestResult(!realResultFirst, "Should Not Detect Vertical Win Position For Any Player Test P.I.");
        checkTestResult(!realResultSecond, "Should Not Detect Vertical Win Position For Any Player Test P.II.");
        checkTestResult(!realResultThird, "Should Not Detect Vertical Win Position For Any Player Test P.III.");
    }

    private void shouldDetectDiagonalWinPositionFirst() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,1,0},{0,0,1},{-1,1,0}};
        int[][] newFieldSecond = {{1,0,0},{1,0,0},{0,-1,-1}};
        boolean realResultFirst = newGame.isWinPositionForDiagonals(newFieldFirst, 0);
        boolean realResultSecond = newGame.isWinPositionForDiagonals(newFieldSecond, 0);
        checkTestResult(realResultFirst, "Should Detect Diagonal Win Position First Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Diagonal Win Position First Player Test P.II.");
    }

    private void shouldDetectDiagonalWinPositionSecond() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{1,-1,0},{0,1,-1},{-1,-1,1}};
        int[][] newFieldSecond = {{-1,-1,1},{-1,1,-1},{1,-1,-1}};
        boolean realResultFirst = newGame.isWinPositionForDiagonals(newFieldFirst, 1);
        boolean realResultSecond = newGame.isWinPositionForDiagonals(newFieldSecond, 1);
        checkTestResult(realResultFirst, "Should Detect Diagonal Win Position Second Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Diagonal Win Position Second Player Test P.II.");
    }

    private void shouldNotDetectDiagonalWinPositionForAnyPlayer() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,1,1},{-1,-1,1},{1,1,-1}};
        int[][] newFieldSecond = {{1,-1,0},{-1,1,1},{1,1,-1}};
        int[][] newFieldThird = {{1,-1,1},{-1,-1,1},{-1,1,0}};
        boolean realResultFirst = newGame.isWinPositionForDiagonals(newFieldFirst, 0);
        boolean realResultSecond = newGame.isWinPositionForDiagonals(newFieldSecond, 1);
        boolean realResultThird = newGame.isWinPositionForDiagonals(newFieldThird, 2);
        checkTestResult(!realResultFirst, "Should Not Detect Diagonal Win Position For Any Player Test P.I.");
        checkTestResult(!realResultSecond, "Should Not Detect Diagonal Win Position For Any Player Test P.II.");
        checkTestResult(!realResultThird, "Should Not Detect Diagonal Win Position For Any Player Test P.III.");
    }

    private void shouldDetectWinPositionForFirstPlayer() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{0,0,0},{0,0,0},{0,0,0}};
        int[][] newFieldSecond= {{0,0,0},{0,0,0},{0,0,0}};
        int[][] newFieldThird = {{0,0,0},{0,0,0},{0,0,0}};
        boolean realResultFirst = newGame.isWin(newFieldFirst,0);
        boolean realResultSecond = newGame.isWin(newFieldSecond, 0);
        boolean realResultThird = newGame.isWin(newFieldThird, 0);
        checkTestResult(realResultFirst, "Should Detect Win Position For First Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Win Position For First Player Test P.II.");
        checkTestResult(realResultThird, "Should Detect Win Position For First Player Test P.III.");
    }

    private void shouldDetectWinPositionForSecondPlayer() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] newFieldSecond= {{1,1,1},{1,1,1},{1,1,1}};
        int[][] newFieldThird = {{1,1,1},{1,1,1},{1,1,1}};
        boolean realResultFirst = newGame.isWin(newFieldFirst,1);
        boolean realResultSecond = newGame.isWin(newFieldSecond, 1);
        boolean realResultThird = newGame.isWin(newFieldThird, 1);
        checkTestResult(realResultFirst, "Should Detect Win Position For Second Player Test P.I.");
        checkTestResult(realResultSecond, "Should Detect Win Position For Second Player Test P.II.");
        checkTestResult(realResultThird, "Should Detect Win Position For Second Player Test P.III.");
    }

    private void shouldNotDetectWinPositionForAnyPlayer() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        int[][] newFieldSecond= {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        int[][] newFieldThird = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        boolean realResultFirst = newGame.isWin(newFieldFirst,0);
        boolean realResultSecond = newGame.isWin(newFieldSecond, 1);
        boolean realResultThird = newGame.isWin(newFieldThird, 2);
        checkTestResult(!realResultFirst, "Should Not Detect Win Position For Any Player Test P.I.");
        checkTestResult(!realResultSecond, "Should Not Detect Win Position For Any Player Test P.II.");
        checkTestResult(!realResultThird, "Should Not Detect Win Position For Any Player Test P.III.");
    }

    private void shouldDetectDraw() {
        TicTacToe newGame = new TicTacToe();
        int[][] newFieldFirst = {{1,1,0},{0,1,1},{1,0,0}};
        int[][] newFieldSecond= {{0,0,1},{1,1,0},{0,1,1}};
        int[][] newFieldThird = {{0,1,0},{1,0,1},{1,0,1}};
        boolean realResultFirst = newGame.isDraw(newFieldFirst);
        boolean realResultSecond = newGame.isDraw(newFieldSecond);
        boolean realResultThird = newGame.isDraw(newFieldThird);
        checkTestResult(realResultFirst, "Should detect Draw Position Test P.I.");
        checkTestResult(realResultSecond, "Should detect Draw Position Test P.II.");
        checkTestResult(realResultThird, "Should detect Draw Position Test P.III.");
    }

    private void shouldCreateNewField() {
        TicTacToe newGame = new TicTacToe();
        int[][] expectedResult = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        int[][] realResult = newGame.createField();
        checkTestResult(Arrays.deepEquals(expectedResult, realResult),"Should Create New Field Test");
    }


}
