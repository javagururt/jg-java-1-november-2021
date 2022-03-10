package student_eduards_puzirevskis.lesson_7_encapsulation.level_6_middle;

import java.math.BigDecimal;

class CreditCard {

     private int cardNumber;
     private int pinCode;
     private BigDecimal balance = BigDecimal.ZERO;
     private BigDecimal creditLimit = BigDecimal.ZERO;
     private BigDecimal loanDebt = BigDecimal.ZERO;


     public CreditCard(int cardNumber, int pinCode){
         super();
         this.cardNumber = cardNumber;
         this.pinCode = pinCode;
     }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(BigDecimal loanDebt) {
        this.loanDebt = loanDebt;
    }
}
