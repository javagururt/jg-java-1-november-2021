package student_dmitrijs_sinkevics.lesson_10.lvl_3_junior;



public class GameOfLifeNextGenerationDemo  {

    public static void main(String[] args) {
        GameOfLifeNextGenerationCalculator demo = new GameOfLifeNextGenerationCalculator(8, 5);

        demo.setAlive(2, 2);
        demo.setAlive(3, 2);
        demo.setAlive(4, 2);

        demo.printBoard();

        demo.step();

        demo.printBoard();

        demo.step();

        demo.printBoard();


    }
}

