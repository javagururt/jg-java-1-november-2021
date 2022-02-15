package student_valeriia_kulikova.lesson_7_encapsulation.homework.level_6_middle;



public class CreditCard {
    private long cardNumber = 0;
    private long cardPIN = 0;
    private long balance = 0;
    private long creditLimit = 0;
    private long limitDebt = 0;

    public CreditCard(long cardNumber, long cardPIN) {
        this.cardNumber = cardNumber;
        this.cardPIN = cardPIN;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getCardPIN() {
        return cardPIN;
    }

    public long getBalance() {
        return balance;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public long getLimitDebt() {
        return limitDebt;
    }

    public void Deposit (long cardPIN2, long sumOfDeposit){
        if (cardPIN2 == cardPIN) {
            if (limitDebt >= sumOfDeposit) {
                limitDebt = limitDebt - sumOfDeposit;
            } else {
                balance = balance + sumOfDeposit - limitDebt;
                limitDebt = 0;
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void Withdraw (long cardPin2, long sumOfWithdraw) {
        if (cardPin2 == cardPIN) {

                if (sumOfWithdraw <= balance) {
                balance = balance - sumOfWithdraw;
                } else if (sumOfWithdraw <= (balance + creditLimit - limitDebt)){
                limitDebt = limitDebt + sumOfWithdraw - balance;
                balance = 0;
                } else {
                    System.out.println("Invalid operation. Withdraw amount exceeds balance and credit limit.");
                }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
    }



