package student_stanislav_p.lesson_7_encapsulation.level_6_middle;

import java.util.Scanner;

public class CreditCardDemo {

    public static void main(String[] args) {


        CreditCardDemo cardDemo = new CreditCardDemo();

        long depositAmount= 0;
        long withDrawAmount =0;

        long cardNumber = cardDemo.enteredData("Credit card number ");
        long cardPin = cardDemo.enteredData("Credit card PIN ");
        long cardCreditLimit = cardDemo.enteredData("Credit card credit limit ");

        CreditCard newCard = new CreditCard(cardNumber,cardPin,cardCreditLimit);



        depositAmount = cardDemo.enteredData("Please enter deposit amount -> ");

        boolean resultOfDeposit = newCard.makeDepositCard(cardPin,depositAmount);

        if (resultOfDeposit) cardDemo.printCardData(newCard.cardNumber,
                                                    newCard.cardPinCode,
                                                    newCard.cardBalance,
                                                    newCard.cardCreditLineDebt,
                                                    newCard.cardCreditLimit);

        withDrawAmount = cardDemo.enteredData("Please enter withdraw amount -> ");

        boolean resultOfWithdrawt = newCard.makeWithdrawCard(cardPin,withDrawAmount);

        if (resultOfWithdrawt) cardDemo.printCardData(newCard.cardNumber,
                newCard.cardPinCode,
                newCard.cardBalance,
                newCard.cardCreditLineDebt,
                newCard.cardCreditLimit);

    }

    //_-----------------------------------------

    long enteredData(String nameData) {

        Scanner sc = new Scanner(System.in);
        long number;
        do {
            System.out.println("Please enter "+nameData +" ->");
            while (!sc.hasNextLong()) {
                System.out.println("That's a wrong number!");
                sc.next(); // this is important!
            }
            number = sc.nextLong();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);

        return number;
    }

    void printCardData (long cardNumber,long cardPinCode, long cardBalance, long cardCreditLineDebt, long cardCreditLimit){

        System.out.println( " Current credit card status :");
        System.out.println( " Credit card number  is -> "+cardNumber);
        System.out.println( " Credit card PIN     is -> "+cardPinCode);
        System.out.println( " Credit card balance is -> "+cardBalance);
        System.out.println( " Credit card credit debt  is -> "+cardCreditLineDebt);
        System.out.println( " Credit card credit limit is -> "+cardCreditLimit);


    }
}
