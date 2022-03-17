package teacher.lesson_16.lessoncode;

import java.math.BigDecimal;

class BankAccountDepositRunnable implements Runnable {

    private BankAccount bankAccount;

    public BankAccountDepositRunnable(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            bankAccount.deposit(new BigDecimal("1000"));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
