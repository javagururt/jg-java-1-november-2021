package student_eduards_puzirevskis.lesson_10_junit.level_3_junior;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

class GameOfLifeNextGenerationDemo {
  public static void main(String[] args) {

   String[][] lifeMap = getFieldSizeFromUser();

   GameOfLifeNextGenerationCalculator gOLDemo = new GameOfLifeNextGenerationCalculator();

   getRandomField(lifeMap);

   while (true) {

    System.out.println ("Initial state:");
    gOLDemo.printLifeMap(lifeMap);
    System.out.println("===========");

    System.out.println ("Type \"0\" to get next generation");
    System.out.println("Type any other integer to exit.");
    int exitBottom = new Scanner(System.in).nextInt();
    if (exitBottom != 0) {
     break;
    }
    int[] point = gOLDemo.check(lifeMap, new int[lifeMap.length* lifeMap.length]);
    lifeMap = gOLDemo.calculate(lifeMap, point).clone();
    gOLDemo.printLifeMap(lifeMap);
    System.out.println("===========");
   }
  }

 @NotNull
 private static String[][] getFieldSizeFromUser() {
  System.out.println("Hello! Let's play Game of life!");
  System.out.println("Please, how big will be our field?");
  Scanner scanner = new Scanner(System.in);
  if (scanner.hasNextInt()) {
   int fieldLength = scanner.nextInt();
   return new String[fieldLength][fieldLength];
  } else {
   throw new IllegalArgumentException("It's not integer");
  }


 }

 private static void getRandomField(String[][] lifeMap) {
  for (int i = 0; i < lifeMap.length; i++) {
   for (int j = 0; j < lifeMap.length; j++) {

    int num = new Random().nextInt(2);
    if (num == 1)
     lifeMap[i][j] = "●";
    else lifeMap[i][j] = "o";
   }
  }
 }

}

