package student_mihails_nikolajevs.lesson_10_junit.level_3_junior;

import java.util.Random;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class GameOfLifeNextGenerationDemo {

    public static void main(String[] args) {

        String[][] lifeMap = getFieldSizeFromUser();

        GameOfLifeNextGenerationCalculator Demo = new GameOfLifeNextGenerationCalculator();

        getRandomField(lifeMap);

        while (true) {

            System.out.println("Original state:");
            Demo.printLifeMap(lifeMap);
            System.out.println("----------------");

            System.out.println("Enter \"0\" To Get Next Generation");
            System.out.println("Enter Any Integer To EXIT!");
            int exitBottom = new Scanner(System.in).nextInt();
            if (exitBottom != 0) {
                break;
            }
            int[] point = Demo.check(lifeMap, new int[lifeMap.length * lifeMap.length]);
            lifeMap = Demo.calculate(lifeMap, point).clone();
            Demo.printLifeMap(lifeMap);
            System.out.println("-----------------");
        }
    }

    private static String[][] getFieldSizeFromUser() {
        System.out.println(" HELLO!!! Let's Play The GAME OF LIFE!!! ");
        System.out.println(" Please Enter Your Size Of Field: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int fieldLength = in.nextInt();
            return new String[fieldLength][fieldLength];
        } else {
            throw new IllegalArgumentException("Sorry ! Its Not INTEGER!!!");
        }
    }

    private static void getRandomField(String[][] lifeMap) {
        for (int i = 0; i < lifeMap.length; i++) {
            for (int j = 0; j < lifeMap.length; j++) {

                int num = new Random().nextInt(2);
                if (num == 1)
                    lifeMap[i][j] = "@";
                else lifeMap[i][j] = "o";
            }
        }
    }
}