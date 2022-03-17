package teacher.lesson_16.lessoncode;

import java.math.BigDecimal;

class BankAccount {

    private BigDecimal amount = BigDecimal.ZERO;
    private String cardholder;

    public void deposit(BigDecimal deposit) {
        amount = amount.add(deposit);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "amount=" + amount +
                ", cardholder='" + cardholder + '\'' +
                '}';
    }
}
