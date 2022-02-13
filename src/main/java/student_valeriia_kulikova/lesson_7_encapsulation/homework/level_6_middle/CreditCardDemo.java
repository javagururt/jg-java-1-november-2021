package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;

import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your card number:");
        long cardName = scanner.nextLong();
        System.out.println("Please, enter your PIN-code:");
        long cardPin = scanner.nextLong();
        CreditCard creditCard = new CreditCard(cardName, cardPin);
        System.out.println("Do you want to set a credit limit? 1 - YES, 0 - NO");
        int operationsWithLimitCredit = scanner.nextInt();
        if (operationsWithLimitCredit == 1) {
            System.out.println("Enter the amount of the credit limit:");
            long newCreditLimit = scanner.nextLong();
            creditCard.setCreditLimit(newCreditLimit);
        } else if (operationsWithLimitCredit == 0) {
            System.out.println("Credit limit is: " + creditCard.getCreditLimit());
        } else {
            System.out.println("Incorrect operation. Please, choose 1 or 2.");
        }

        while (true) {

            System.out.println("Choose your operation:");
            System.out.println("1 - DEPOSIT");
            System.out.println("2 - WITHDREW");
            int operationsWithCard = scanner.nextInt();
            if (operationsWithCard == 1) {
                System.out.println("Please, enter your PIN-code:");
                long cardPin2 = scanner.nextLong();
                System.out.println("Please, enter sum of deposit");
                long cardDeposit2 = scanner.nextLong();
                creditCard.Deposit(cardPin2, cardDeposit2);
                System.out.println("Balance: " + creditCard.getBalance());
                System.out.println("Credit limit: " + creditCard.getCreditLimit());
                System.out.println("Sum of debt: " + creditCard.getLimitDebt());
            } else if (operationsWithCard == 2) {
                System.out.println("Please, enter your PIN-code:");
                long cardPin3 = scanner.nextLong();
                System.out.println("Please, enter sum of withdrew:");
                long sumOfWithdrew = scanner.nextLong();
                creditCard.Withdraw(cardPin3, sumOfWithdrew);
                System.out.println("Balance: " + creditCard.getBalance());
                System.out.println("Credit limit: " + creditCard.getCreditLimit());
                System.out.println("Sum of debt: " + creditCard.getLimitDebt());
            } else {
                System.out.println("Incorrect operation. Please, choose 1 or 2.");
            }
        }
    }


}
