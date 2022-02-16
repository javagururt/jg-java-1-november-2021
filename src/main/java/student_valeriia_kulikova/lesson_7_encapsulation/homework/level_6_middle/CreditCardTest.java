package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;

public class CreditCardTest {
    public static void main(String[] args) {
        long creditCardNumberTest = 1234;
        long creditCardPinTest = 1111;
        long creditCardPinTest2 = 1112;
        long sumOfDepositTest = 1000;
        CreditCard creditCardTest = new CreditCard(creditCardNumberTest,creditCardPinTest);
        creditCardTest.Deposit(creditCardPinTest,sumOfDepositTest);
        boolean testResult = (sumOfDepositTest == creditCardTest.getBalance());
        if (testResult) {
            System.out.println("Test 'Deposit' is OK.");
        } else {
            System.out.println("Test 'Deposit' is FAIL.");
        }

        creditCardTest.Deposit(creditCardPinTest2,10000);
        testResult = (sumOfDepositTest == creditCardTest.getBalance());
        if (testResult) {
            System.out.println("Test 'Wrong PIN' is OK.");
        } else {
            System.out.println("Test 'Wrong PIN' is FAIL.");
        }

        creditCardTest.Withdraw(creditCardPinTest,500);
        creditCardTest.setCreditLimit(1000);
        long sumOfBalance = 500;
        testResult = (sumOfBalance == creditCardTest.getBalance());
        if (testResult) {
            System.out.println("Test1 'Withdraw' is OK.");
        } else {
            System.out.println("Test1 'Withdraw' is FAIL.");
        }

        creditCardTest.Withdraw(creditCardPinTest,1000);
        long sumOfCreditLimit = 500;
        testResult = (sumOfCreditLimit == creditCardTest.getLimitDebt());
        if (testResult) {
            System.out.println("Test2 'Withdraw' is OK.");
        } else {
            System.out.println("Test2 'Withdraw' is FAIL.");
        }

        creditCardTest.Withdraw(creditCardPinTest2,1000);
        long sumOfCreditLimit2 = 500;
        testResult = (sumOfCreditLimit2 == creditCardTest.getLimitDebt());
        if (testResult) {
            System.out.println("Test 'Withdraw. Incorrect Pin' is OK.");
        } else {
            System.out.println("Test 'Withdraw. Incorrect Pin' is FAIL.");
        }

        creditCardTest.Withdraw(creditCardPinTest,5000);
        long sumOfCreditLimit3 = 500;
        testResult = (sumOfCreditLimit3 == creditCardTest.getLimitDebt());
        if (testResult) {
            System.out.println("Test3 'Withdraw' is OK.");
        } else {
            System.out.println("Test3 'Withdraw' is FAIL.");
        }
    }
}
