package student_valeriia_kulikova.lesson_10_junit.homework.level_3_4_junior;

import java.util.Random;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeApp {
    public static void main(String[] args) {
        GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();
        GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
        GameOfLifeApp newGame = new GameOfLifeApp();
        boolean checkChoice = true;
        int choice = 0;
        while (checkChoice) {
            choice = newGame.userChoice();
            if (choice == 1 || choice == 2) {
                checkChoice = false;}
        }
        boolean [][] gameField = newGame.createArray(choice);
        gameField = generator.fillingArray(gameField);

        for (int i = 0; i < 10; i++) {
            gameField = test.calculate(gameField);
            System.out.println("****************** NEXT GENERATION *********************");
            newGame.printGeneration(gameField);
        }
    }

    public int userChoice () {
        System.out.println("How do you want to create the field?");
        System.out.println("If yourself - press '1'.");
        System.out.println("If random - press '2'");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public boolean [][] createArray (int choice) {
        switch (choice) {
            case 1 : Scanner scanner = new Scanner(System.in);
                System.out.println("Enter size of your 'X' field:");
                int sizeI = scanner.nextInt();
                System.out.println("Enter size of your 'Y' field:");
                int sizeJ = scanner.nextInt();
                boolean [][] userArray = new boolean[sizeI][sizeJ];
                return userArray;
            case 2 :     Random random = new Random();
                int sizeI1 = random.nextInt(21) + 5;
                int sizeJ2 = random.nextInt(21) + 5;
                boolean [][] randomArray = new boolean[sizeI1][sizeJ2];
                return randomArray;
            default:
                System.out.println("Ooops! Something wrong!");
        }

        return new boolean[0][];
    }

    public void printGeneration (boolean [][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field [i][j]) {
                    System.out.print(" X ");
                } else  {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
