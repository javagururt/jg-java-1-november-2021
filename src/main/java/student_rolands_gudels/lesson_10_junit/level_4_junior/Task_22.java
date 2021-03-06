package student_rolands_gudels.lesson_10_junit.level_4_junior;

public class Task_22 {
/*    Генерация следующего поколения в игре Conway's Game of Life
            (https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).

    Подводим итоги фазы дизайна решения для игры GameOfLife.

    Мы спроектировали следующие классы:
            - GameOfLifeConsoleUI (отвечает за UI),
- GameOfLifeRandomFieldGenerator (отвечает за генерацию начального состояния игры),
- GameOfLifeNextGenerationCalculator (отвечает за расчёт следующего состояния игры).

    Теперь осталось собрать из этих классов готовую систему.

    Класс GameOfLife идеально подойдёт для этого!

    class GameOfLife {
        private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
        private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
        private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

        public void run() {
            boolean[][] field = generator.generate(10, 10);
            while(true) {
                ui.show(filed);
                sleepForSeconds(5);
                field = calculator.calculate(field);
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

    }*/
}
