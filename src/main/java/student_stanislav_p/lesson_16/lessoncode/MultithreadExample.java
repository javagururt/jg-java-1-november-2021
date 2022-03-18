package student_stanislav_p.lesson_16.lessoncode;

import teacher.lesson_16.lessoncode.BankAccount;
import teacher.lesson_16.lessoncode.BankAccountService;

import java.math.BigDecimal;

class MultithreadExample {


    public static void main(String[] args) throws InterruptedException {
        var service = new teacher.lesson_16.lessoncode.BankAccountService(null, null);
        var firstBankAccount = new teacher.lesson_16.lessoncode.BankAccount();
        firstBankAccount.setAmount(new BigDecimal("10000"));
        firstBankAccount.setCardholder("Viktor");

        var secondBankAccount = new teacher.lesson_16.lessoncode.BankAccount();
        secondBankAccount.setCardholder("Ruslan");

        var thread1 = new Thread(() -> service.increaseBalance(firstBankAccount, new BigDecimal("10000")));
        var thread2 = new Thread(() -> service.increaseBalance(secondBankAccount, new BigDecimal("1000")));

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();

        System.out.println("Results:");
        System.out.println(firstBankAccount);
        System.out.println(secondBankAccount);
    }
}
