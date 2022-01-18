package student_ruslans_tufetulovs.questions;


public class CreditCardTest {

    public static void main(String[] args) {


        CreditCardTest cardTest = new CreditCardTest();


        long cardNumberExpected = 1234_5678_1234_5678L;
        long cardPinExpected = 1234;
        long cardBalanceExpected = 0 ;
        long cardCreditLineDebtExpected = 0;
        long cardCreditLimitExpected = 5000;

        boolean realResult = true;
        boolean expectedResult = true;

        long depositAmount = 5000;
        long withDrawAmount = 4000;


        //-------- TEST 1 -------

        CreditCard newCard = new CreditCard(cardNumberExpected,cardPinExpected,cardCreditLimitExpected);


        realResult = cardTest.checkCondition(cardNumberExpected,newCard.cardNumber);
        realResult = realResult&&cardTest.checkCondition(cardPinExpected ,newCard.cardPinCode);
        realResult = realResult&&cardTest.checkCondition(cardBalanceExpected,newCard.cardBalance);
        realResult = realResult&&cardTest.checkCondition(cardCreditLineDebtExpected ,newCard.cardCreditLineDebt);

        realResult = realResult&&cardTest.checkCondition(cardCreditLimitExpected,newCard.cardCreditLimit);


        cardTest.checkTestResult("Test 1 (created new credit cart) - ", realResult,expectedResult);

        cardTest.printCardData( newCard.cardNumber, newCard.cardPinCode, newCard.cardBalance, newCard.cardCreditLineDebt, newCard.cardCreditLimit);

        //-------- TEST 2 -------

        realResult = newCard.makeDepositCard(newCard.cardPinCode,depositAmount);

        cardBalanceExpected = 5000;
        cardCreditLineDebtExpected = 0;

        realResult = realResult&&cardTest.checkCondition(cardBalanceExpected,newCard.cardBalance);
        realResult = realResult&&cardTest.checkCondition(cardCreditLineDebtExpected ,newCard.cardCreditLineDebt);



        cardTest.checkTestResult("Test 2 (put deposit on the credit cart) - ", realResult,expectedResult);


        cardTest.printCardData( 0, 0, newCard.cardBalance, newCard.cardCreditLineDebt, newCard.cardCreditLimit);



        //-------- TEST 3.1 -------

        realResult = newCard.makeWithdrawCard(newCard.cardPinCode,withDrawAmount);


        cardBalanceExpected = 1000;
        cardCreditLineDebtExpected = 0;

        realResult = realResult&&cardTest.checkCondition(cardBalanceExpected,newCard.cardBalance);
        realResult = realResult&&cardTest.checkCondition(cardCreditLineDebtExpected ,newCard.cardCreditLineDebt);



        cardTest.checkTestResult("Test 3.1 (withdraw first time from credit cart) - ", realResult,expectedResult);


      //  cardTest.printCardData( newCard.cardNumber, newCard.cardPinCode, newCard.cardBalance, newCard.cardCreditLineDebt, newCard.cardCreditLimit);

        //-------- TEST 3.2 -------

        realResult = newCard.makeWithdrawCard(newCard.cardPinCode,withDrawAmount);


        cardBalanceExpected = 0;
        cardCreditLineDebtExpected = 3000;

        realResult = realResult&&cardTest.checkCondition(cardBalanceExpected,newCard.cardBalance);
        realResult = realResult&&cardTest.checkCondition(cardCreditLineDebtExpected ,newCard.cardCreditLineDebt);



        cardTest.checkTestResult("Test 3.2 (withdraw second time from credit cart) - ", realResult,expectedResult);


      //  cardTest.printCardData( newCard.cardNumber, newCard.cardPinCode, newCard.cardBalance, newCard.cardCreditLineDebt, newCard.cardCreditLimit);

        //-------- TEST 3.3 -------

        realResult = (newCard.makeWithdrawCard(newCard.cardPinCode,withDrawAmount)==false);


        cardBalanceExpected = 0;
        cardCreditLineDebtExpected = 3000;

        realResult = realResult&&cardTest.checkCondition(cardBalanceExpected,newCard.cardBalance);
        realResult = realResult&&cardTest.checkCondition(cardCreditLineDebtExpected ,newCard.cardCreditLineDebt);



        cardTest.checkTestResult("Test 3.3 (withdraw third time from credit cart) - ", realResult,expectedResult);


      //  cardTest.printCardData( newCard.cardNumber, newCard.cardPinCode, newCard.cardBalance, newCard.cardCreditLineDebt, newCard.cardCreditLimit);

    }

    //_-----------------------------------------


    boolean checkCondition(long resultExpected, long resultReal){


        return (resultReal==resultExpected);
    }

    /*
     boolean checkCondition(CreditCardDemo cardtest,CreditCard newCard){
        boolean result = true;

        result = result*(cardNumberExpected.cardTest, cardNumber


        return result;
    }
     */


    void checkTestResult(String nameTest, boolean realResult,  boolean expectedResult){

        if (realResult == expectedResult) {
            System.out.println(nameTest + " Control is OK");
        } else {
            System.out.println(nameTest + " Control is FAIL");
        }
    }

    void printCardData (long cardNumber,long cardPinCode, long cardBalance, long cardCreditLineDebt, long cardCreditLimit){

        System.out.println( " Current credit card status :");
        if (cardNumber>0) System.out.println( " Credit card number  is -> "+cardNumber);
        if (cardPinCode>0) System.out.println( " Credit card PIN     is -> "+cardPinCode);
        if (cardBalance>0) System.out.println( " Credit card balance is -> "+cardBalance);
        if (cardCreditLineDebt>0) System.out.println( " Credit card credit debt  is -> "+cardCreditLineDebt);
        if (cardCreditLimit>0) System.out.println( " Credit card credit limit is -> "+cardCreditLimit);


    }
}
