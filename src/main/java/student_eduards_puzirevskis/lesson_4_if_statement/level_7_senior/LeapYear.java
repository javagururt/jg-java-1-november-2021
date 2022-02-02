package student_eduards_puzirevskis.lesson_4_if_statement.level_7_senior;

import java.util.Scanner;
/*
// return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.
    }
 */
class LeapYear {
     public static void main(String[] args) {
         LeapYear leapYear = new LeapYear();
         int userYear = leapYear.getYearFromUser();
         boolean checkResult = leapYear.isLeapYear(userYear);
         leapYear.printResult(checkResult);

     }

     public void printResult(boolean result) {
         if (result) {
             System.out.println("Your year is Leap");
         } else {
             System.out.println("Your year is not Leap");
         }
     }

    public int getYearFromUser() {
        System.out.println("Please, enter year to check.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean isLeapYear(int year) {
         if (!isDividedByFour(year)) {
             return false;
         }
         if (!isDividedByHundred(year)) {
             return true;
         }
         return isDividedByFourHundred(year);
    }

    public boolean isDividedByFour(int year) {
         return year % 4 == 0;
    }

    public boolean isDividedByHundred(int year) {
        return year % 100 == 0;
    }

    public boolean isDividedByFourHundred(int year) {
        return year % 400 == 0;
    }



}
