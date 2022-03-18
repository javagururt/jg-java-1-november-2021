package student_stanislav_p.lesson_16.lessoncode;



import java.util.Date;

class BankAccountDemo {

    public static void main(String[] args) throws InterruptedException {
        var bankAccount = new BankAccount();
        bankAccount.setCardholder("Ruslan");
        var depositThread = new Thread(new BankAccountDepositRunnable(bankAccount));
        depositThread.start();

        while (true) {
            var currentDate = new Date(System.currentTimeMillis());
            System.out.println("Current time:");
            System.out.println(currentDate);
            System.out.println("Account balance: " + bankAccount.getAmount());
            System.out.println("Cardholder: " + bankAccount.getCardholder());
            Thread.sleep(3000);
        }
    }
}
