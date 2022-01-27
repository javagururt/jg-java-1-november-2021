package student_andrei_karamnov.lesson_7_encapsulation.homework.level_6_middle;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        long expectedCardNumber = 1234_1234_1234_1234L;
        long expectedCardPinCode = 5432;

        double expectedCardBalance = 0;
        double expectedCreditCardLimit = 3000;
        double expectedCardLoanDebt = 0;

        boolean expectedResult = true;
        boolean realResult;

        double depositAmount = 5000;
        double withdrawAmount = 3000;


        CreditCard myCard = new CreditCard(expectedCardNumber, expectedCardPinCode, expectedCreditCardLimit);

        realResult = test.checkResultLong(expectedCardNumber, myCard.cardNumber);
        realResult = realResult&&test.checkResultLong(expectedCardPinCode, myCard.cardPinCode);
        realResult = realResult&&test.checkResultDouble(expectedCardBalance, myCard.cardBalance);
        realResult = realResult&&test.checkResultDouble(expectedCreditCardLimit, myCard.creditCardLimit);
        realResult = realResult&&test.checkResultDouble(expectedCardLoanDebt, myCard.cardLoanDebt);

        test.passOrFail("Card Information TEST1", realResult, expectedResult);
        System.out.println("");
        test.printCardInformation(myCard.cardNumber, myCard.cardPinCode, myCard.cardBalance, myCard.creditCardLimit, myCard.cardLoanDebt);
        System.out.println("");

        realResult = myCard.cardDepositOperation(myCard.cardPinCode, depositAmount);
        expectedCardBalance = 5000;
        expectedCardLoanDebt = 0;
        realResult = realResult&&test.checkResultDouble(myCard.cardBalance, expectedCardBalance);
        realResult = realResult&&test.checkResultDouble(myCard.cardLoanDebt, expectedCardLoanDebt);

        test.passOrFail("Card Deposit Operation TEST2", realResult, expectedResult);
        System.out.println("");
        test.printCardInformation(myCard.cardNumber, myCard.cardPinCode, myCard.cardBalance, myCard.creditCardLimit, myCard.cardLoanDebt);
        System.out.println("");

        realResult = myCard.cardWithdrawOperation(myCard.cardPinCode, withdrawAmount);
        expectedCardBalance = 2000;
        expectedCardLoanDebt = 0;
        realResult = realResult&&test.checkResultDouble(myCard.cardBalance, expectedCardBalance);
        realResult = realResult&&test.checkResultDouble(myCard.cardLoanDebt, expectedCardLoanDebt);

        test.passOrFail("Card Withdraw Operation TEST3", realResult, expectedResult);
        System.out.println("");
        test.printCardInformation(myCard.cardNumber, myCard.cardPinCode, myCard.cardBalance, myCard.creditCardLimit, myCard.cardLoanDebt);
        System.out.println("");

        realResult = myCard.cardWithdrawOperation(myCard.cardPinCode, withdrawAmount);
        expectedCardBalance = 0;
        expectedCardLoanDebt = -1000;
        realResult = realResult&&test.checkResultDouble(myCard.cardBalance, expectedCardBalance);
        realResult = realResult&&test.checkResultDouble(myCard.cardLoanDebt, expectedCardLoanDebt);

        test.passOrFail("Card Withdraw Operation TEST4", realResult, expectedResult);
        System.out.println("");
        test.printCardInformation(myCard.cardNumber, myCard.cardPinCode, myCard.cardBalance, myCard.creditCardLimit, myCard.cardLoanDebt);
        System.out.println("");

        realResult = myCard.cardDepositOperation(myCard.cardPinCode, depositAmount);
        realResult = realResult&&myCard.cardWithdrawOperation(myCard.cardPinCode, withdrawAmount);
        expectedCardBalance = 3000;
        expectedCardLoanDebt = 0;
        realResult = realResult&&test.checkResultDouble(myCard.cardBalance, expectedCardBalance);
        realResult = realResult&&test.checkResultDouble(myCard.cardLoanDebt, expectedCardLoanDebt);

        test.passOrFail("Card Withdraw Operation TEST5", realResult, expectedResult);
        System.out.println("");
        test.printCardInformation(myCard.cardNumber, myCard.cardPinCode, myCard.cardBalance, myCard.creditCardLimit, myCard.cardLoanDebt);
        System.out.println("");

    }
    void printCardInformation(long cardNumber, long cardPinCode, double cardBalance, double cardCreditLimit, double cardLoanDebt){
        System.out.println("Card information: ");
        System.out.println("Card number: " + cardNumber);
        System.out.println("Card pin-code: " + cardPinCode);
        System.out.println("Card balance: " + cardBalance);
        System.out.println("Card limit: " + cardCreditLimit);
        System.out.println("Card loan debt: " + cardLoanDebt);
    }
    boolean checkResultLong(long actual,long expected) {
        return (actual == expected);
    }
    boolean checkResultDouble(double actual,double expected) {
        return (actual == expected);
    }
    void passOrFail(String testName, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println(testName + " is OK " );
        } else {
            System.out.println(testName + " FAILED " );
        }
}}

