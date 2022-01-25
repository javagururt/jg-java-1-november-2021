package student_stanislav_p.lesson_6_arrays_while_loop.level_5_middle;


class TicTacToeTest {

    public static void main(String[] args) {

    TicTacToeTest gameTest = new TicTacToeTest();

        gameTest.createFieldTest();
        gameTest.movePlayer1Test();
        gameTest.movePlayer2Test();

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
        System.out.println("-------------------------------------------------------");

    }


    void movePlayer1Test() {
        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();
        int [][] expectedArray =  {{0,-1,-1},{-1,-1,-1},{-1,-1,-1}};

        int realResult=0;
        int expectedResult = 9;

        System.out.println(" Для теста введите координаты клетки 1 и 1 ");

       gameNew.movePlayer1(testArray,1);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (testArray[i][j] == expectedArray[i][j]) realResult++;
            }
        }

        checkTestResult("Test 2. 'move Player1 Test'",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");

    }


    void movePlayer2Test() {
        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();
        int [][] expectedArray =  {{-1,-1,-1},{-1,1,-1},{-1,-1,-1}};

        int realResult=0;
        int expectedResult = 9;

        System.out.println(" Для теста введите координаты клетки 2 и 2 ");

        gameNew.movePlayer2(testArray,1);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (testArray[i][j] == expectedArray[i][j]) realResult++;
            }
        }

        checkTestResult("Test 3. 'move Player2 Test'",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");

    }


    void isCellValidTest() {
        TicTacToe gameNew =   new TicTacToe();


        int realResult=0;
        int expectedResult = 1;


        boolean expectedTrueResult = true;
        boolean expectedFalseResult = false;


       if (gameNew.isCellValid(1,1)==expectedTrueResult) { realResult = 1;}

        checkTestResult("Test 4. 'is Cell Valid Test (true)'",realResult, expectedResult);

        if (gameNew.isCellValid(0,5)==expectedFalseResult) { realResult = 1;}

        checkTestResult("Test 4. 'is Cell Valid Test (false)'",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");



    }


    void isWinPositionForHorizontalsTest() {
        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();

        int realResult=0;
        int expectedResult = 1;

        testArray[0][0]=0;
        testArray[0][1]=0;
        testArray[0][2]=0;

        if (gameNew.isWinPositionForHorizontals(testArray,1)) realResult=1;


        checkTestResult("Test 5.  is Win Position For Horizontals Test (true) ",realResult, expectedResult);

        realResult=0;
        expectedResult = 0;

        testArray[0][0]=1;
        testArray[0][1]=0;
        testArray[0][2]=0;

        if (gameNew.isWinPositionForHorizontals(testArray,1)) realResult=1;


        checkTestResult("Test 5.  is Win Position For Horizontals Test (false) ",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");
    }


    void isWinPositionForVerticalsTest() {
        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();

        int realResult=0;
        int expectedResult = 1;

        testArray[0][0]=0;
        testArray[1][0]=0;
        testArray[2][0]=0;

        if (gameNew.isWinPositionForVerticals(testArray,1)) realResult=1;


        checkTestResult("Test 6.  is Win Position For Verticals Test (true) ",realResult, expectedResult);

        realResult=0;
        expectedResult = 0;

        testArray[0][0]=1;
        testArray[1][0]=0;
        testArray[2][0]=0;

        if (gameNew.isWinPositionForVerticals(testArray,1)) realResult=1;


        checkTestResult("Test 6.  is Win Position For Verticals Test (false) ",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");
    }


    void isWinPositionForDiagonalsTest() {

        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();

        int realResult=0;
        int expectedResult = 1;

        testArray[0][0]=0;
        testArray[1][1]=0;
        testArray[2][2]=0;

        if (gameNew.isWinPositionForDiagonals(testArray,1)) realResult=1;


        checkTestResult("Test 7.  is Win Position For Diagonals Test (true) ",realResult, expectedResult);

        realResult=0;
        expectedResult = 0;

        testArray[0][0]=1;
        testArray[1][1]=0;
        testArray[2][2]=0;

        if (gameNew.isWinPositionForVerticals(testArray,1)) realResult=1;


        checkTestResult("Test 7.  is Win Position For VDiagonals Test (false) ",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");
    }


    void isWinTest() {
        TicTacToe gameNew =   new TicTacToe();

        int [] [] testArray = gameNew.createField();

        int realResult=0;
        int expectedResult = 1;

        testArray[0][0]=0;
        testArray[1][0]=0;
        testArray[2][0]=0;

        if (gameNew.isWin(testArray,1)) realResult=1;


        checkTestResult("Test 8.  is Win Position Test (true) ",realResult, expectedResult);


        testArray = gameNew.createField();

        realResult=0;
        expectedResult = 1;

        testArray[0][0]=0;
        testArray[0][1]=0;
        testArray[0][2]=0;

        if (gameNew.isWin(testArray,1)) realResult=1;


        checkTestResult("Test 8.  is Win Position Test (true) ",realResult, expectedResult);

        testArray = gameNew.createField();
        realResult=0;
        expectedResult = 1;

        testArray[0][2]=0;
        testArray[1][1]=0;
        testArray[2][0]=0;

        if (gameNew.isWin(testArray,1)) realResult=1;


        checkTestResult("Test 8.  is Win Position Test (true) ",realResult, expectedResult);

        testArray = gameNew.createField();

        realResult=0;
        expectedResult = 0;

        testArray[0][0]=1;
        testArray[1][1]=0;
        testArray[2][2]=0;

        if (gameNew.isWin(testArray,1)) realResult=1;


        checkTestResult("Test 8.  is Win Position Test (false) ",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");

    }


    void isDrawTest() {

        TicTacToe gameNew =   new TicTacToe();

       // int [] [] testArray = gameNew.createField();

        int [][] testArray = {{0,0,1},{1,1,0},{0,1,0}};

        int realResult=0;
        int expectedResult = 1;


        if (gameNew.isDraw(testArray)) realResult=1;


        checkTestResult("Test 9.  is Draw Test (true) ",realResult, expectedResult);

        realResult=0;
        expectedResult = 0;

        testArray[2][2] = -1;


        if (gameNew.isDraw(testArray)) realResult=1;


        checkTestResult("Test 9.  is Draw Test (false) ",realResult, expectedResult);

        System.out.println("-------------------------------------------------------");
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