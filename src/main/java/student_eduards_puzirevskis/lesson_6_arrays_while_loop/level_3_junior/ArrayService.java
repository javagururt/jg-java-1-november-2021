package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_3_junior;

import java.util.Arrays;
import java.util.Scanner;

class ArrayService {

    public int getOurArraySize() {
        System.out.println("Alright. What size array you would like to create?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


     public int[] createArray(int size) {
      return new int[size];
     }

     public void fillArrayWithRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
         numbers[i] = (int)(Math.random()*101)-50;
        }
     }

     public void printArrayToConsole(int[] numbers) {
        System.out.println("Your array is: " + Arrays.toString(numbers));
     }

     public int whatNumberWeAreLookingFor() {
      System.out.println("Alright. What number would you like to search in our array?");
      Scanner scanner = new Scanner(System.in);
         return scanner.nextInt();
     }

     public boolean findingMatchInArray(int[] numbers, int numberToFind) {
         for (int number : numbers) {
             if (number == numberToFind) {
                 return true;
             }
         }
         return false;
     }


     public void printSearchingResult(int numberToFind, boolean searchingResult, int countOccurrences) {
         if (searchingResult) {
             System.out.println("Nice. I've found your number " + numberToFind + " in array. It occurs " + countOccurrences + " time(s).");
         } else {
             System.out.println("Unfortunately, your number " + numberToFind + " is not found in our array.");
         }
     }

     public int countOccurrences(int[] numbers, int numberToFind) {
        int countOccurrences = 0;
         for (int number : numbers) {
             if (number == numberToFind) {
                 countOccurrences++;
             }
         }
         return countOccurrences;
     }

     public int getNumberToReplace() {
         System.out.println("Ok, which number in array you would like to replace?");
         Scanner scanner = new Scanner(System.in);
         return scanner.nextInt();
     }

    public int getNewNumberToInsert() {
        System.out.println("Which integer you would like to insert?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean replaceNumber(int[] numbers, int numberToReplace, int newNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToReplace) {
                numbers[i] = newNumber;
                return true;
            }
        }
        return false;
    }


    public void printReplacingResults(boolean replacingResults) {
        if (replacingResults) {
            System.out.println("Nice, we've found your number and replace it. Check for new Array.");
        } else {
            System.out.println("There is not such a number. Try again.");
        }
    }


}
