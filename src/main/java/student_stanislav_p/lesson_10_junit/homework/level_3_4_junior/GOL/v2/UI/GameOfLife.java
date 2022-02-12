package student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.UI;

import student_stanislav_p.lesson_10_junit.homework.level_3_4_junior.GOL.v2.logic.GameOfLifeNextGenerationCalculator;

import java.util.concurrent.TimeUnit;

public class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(20, 20);
        int counter =0;

        while(true) {
            System.out.println("Generation №"+counter);

            ui.show(field);
            sleepForSeconds(3);
            field = calculator.calculate(field);
            counter++;
            cls();
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

    private void cls(){
      for (int i = 0; i < 300; i++) {
        System.out.println();
      }
    }

}